package com.example.animal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class AnimalApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnimalApplication.class, args);
    }

}
