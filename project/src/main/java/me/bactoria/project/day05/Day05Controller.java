package me.bactoria.project.day05;


import me.bactoria.project.day05.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Day05Controller {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String resHelloWorld () {
        return userService.resHelloWorld();
    }

    public static void main (String[] args) {
        SpringApplication.run(Day05Controller.class,args);
    }
}
