package me.bactoria.project.day06;

import me.bactoria.project.day06.listener.MyReadyListener;
import me.bactoria.project.day06.listener.MyStartedListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Day06Controller {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Day06Controller.class)
                .properties("spring.config.location=classpath:Day06Application.properties")
                .banner(new MyBanner())
                .listeners(new MyReadyListener())
                .listeners(new MyStartedListener())
                .run("--debug");
    }
}
