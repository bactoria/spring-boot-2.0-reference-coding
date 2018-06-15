package me.bactoria.project.day07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Day07Controller {

    @Autowired
    HelloService helloService;

    @GetMapping("/")
    public String helloMessage() {
        return helloService.getMessage();
    }

    public static void main(String[] args) {


        new SpringApplicationBuilder(Day07Controller.class)

                //아래의 세가지 타입 중 하나 사용 (2.0 이전에는 True / False 였음)
                .web(WebApplicationType.NONE)
                .web(WebApplicationType.REACTIVE)
                .web(WebApplicationType.SERVLET)

                .properties("spring.config.location=classpath:Day07Application.properties")
                .run("--hello=Hello", "--hello=World");

    }
}