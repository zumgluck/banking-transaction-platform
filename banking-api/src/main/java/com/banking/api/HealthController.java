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
public FraudDecision score(@PathVariable int value) {

    // Step 1: Input validation
    if (value < 0 || value > 100) {
        return new FraudDecision(value, "INVALID");
    }

    // Step 2: Fraud decision
    if (value >= 70) {
        return new FraudDecision(value, "DECLINE");
    } else if (value >= 30) {
        return new FraudDecision(value, "REVIEW");
    } else {
        return new FraudDecision(value, "ALLOW");
    }
    }
}
    
