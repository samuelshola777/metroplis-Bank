package com.example.metroplisbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MetroplisBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetroplisBankApplication.class, args);
    }

}
