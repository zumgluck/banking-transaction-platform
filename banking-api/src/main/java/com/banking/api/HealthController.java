package com.banking.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String health() {
        String status = "UP";
        return status;
    }

 @GetMapping("/score/{value}")
public String score(@PathVariable int value) {

    if (value < 0 || value > 100) {
        return "INVALID";
    }

    if (value >= 70) {
        return "DECLINE";
    } else if (value >= 30) {
        return "REVIEW";
    } else {
        return "ALLOW";
    }
}
}
    
