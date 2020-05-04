package top.cokiller.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LeyouUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouUserApplication.class);
    }
}
