package me.bactoria.project.day03;/*just follow https://projects.spring.io/spring-boot */

import me.bactoria.project.day03.configuration.ServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//me.bactoria.project 내부를 기준으로 scan함

@RestController
@Configuration
@EnableAutoConfiguration
@Import(ServiceConfig.class)
public class Day03Controller {

    @GetMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Day03Controller.class, args);
    }
}