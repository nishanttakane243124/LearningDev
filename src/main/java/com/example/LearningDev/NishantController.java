package com.example.LearningDev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NishantController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello! DevOps spring app is running, Nishant here Learning AWS & DevOps.";
    }
}
