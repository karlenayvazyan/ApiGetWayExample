package am.ak.getway.example.gateway.GatewayExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayExampleApplication.class, args);
	}

}
