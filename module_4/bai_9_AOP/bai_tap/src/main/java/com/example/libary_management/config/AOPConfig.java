package com.example.libary_management.config;

import com.example.libary_management.aspect.BooksAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AOPConfig {
    @Bean
    public BooksAspect booksAspect(){
        return new BooksAspect();
    }
}
