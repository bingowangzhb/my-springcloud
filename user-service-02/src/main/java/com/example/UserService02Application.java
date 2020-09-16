package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wang
 */
@RestController
@EnableEurekaClient
@SpringBootApplication
public class UserService02Application {

    public static void main(String[] args) {
        SpringApplication.run(UserService02Application.class, args);
    }

    @GetMapping("/index")
    public String index() {
        return "Response of UserService 02";
    }
}
