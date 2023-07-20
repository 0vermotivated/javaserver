package com.example.demo24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class BookManagerApplication extends SpringBootServletInitializer{

    public static void main(String[] args){
        SpringApplication.run(BookManagerApplication.class, args);
    }
}