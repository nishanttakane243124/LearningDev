package com.example.LearningDev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Submit {
    @GetMapping("/Submit")
    public String submit() {
        return "Submit! Github webhook created and jenkins Pipeline created successfully, Nishant here Learning AWS & DevOps.";
    }
}