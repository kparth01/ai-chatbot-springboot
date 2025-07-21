package com.chatbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.chatbot.config", "com.chatbot.repository"
,"com.chatbot.controller", "com.chatbot.model"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
