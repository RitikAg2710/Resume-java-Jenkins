package com.ritik.resume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class ResumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResumeApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Hi, I am Ritik 👋 Welcome to my Resume App!";
    }
}
