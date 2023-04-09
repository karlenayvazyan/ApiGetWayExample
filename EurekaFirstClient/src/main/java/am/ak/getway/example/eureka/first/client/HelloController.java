package am.ak.getway.example.eureka.first.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Environment environment;

    @GetMapping("/first/hello")
    public String hello() {
        String serverPort = environment.getProperty("local.server.port");
        return "Hello from first service port=" + serverPort;
    }
}
