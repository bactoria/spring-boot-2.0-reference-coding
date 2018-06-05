package me.bactoria.project.day04;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ImportResource("/Day04Application.xml")
public class Day04Controller {


    @GetMapping("/")
    public String resroot () {
        return "Hello World";
    }

    public static void main (String[] args) {
        SpringApplication.run(Day04Controller.class, "--debug");
    }
}
