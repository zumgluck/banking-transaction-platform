package com.banking.api;
import org.springframework.stereotype.Service;
@Service
public class FraudService {

    public FraudDecision calculateDecision(int score) {

        if (score < 0 || score > 100) {
            return new FraudDecision(score, "INVALID");
        }

        if (score >= 70) {
            return new FraudDecision(score, "DECLINE");
        }

        if (score >= 30) {
            return new FraudDecision(score, "REVIEW");
        }

        return new FraudDecision(score, "ALLOW");
    }
}