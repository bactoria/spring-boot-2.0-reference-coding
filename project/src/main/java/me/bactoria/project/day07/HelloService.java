package me.bactoria.project.day07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class HelloService {

    @Autowired
    ApplicationArguments arguments;


    public String getMessage() {
        List<String> helloValues = arguments.getOptionValues("hello");
        return helloValues.stream().collect(Collectors.joining(", "));
    }
}
