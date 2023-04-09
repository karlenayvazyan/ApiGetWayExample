package am.ak.getway.example.eureka.second.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/second/hello")
    public String hello() {
        return "Hello from second service";
    }
}
