package com.example.springaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Base64;

@SpringBootApplication
public class SpringaopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringaopApplication.class, args);
        System.out.println(Base64.getEncoder().encodeToString("binjun0711@gmail.com".getBytes()));
    }

}
