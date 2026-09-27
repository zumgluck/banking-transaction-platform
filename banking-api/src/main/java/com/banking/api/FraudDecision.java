package com.banking.api;

    public class FraudDecision {

    private int score;
    private String decision;

    public FraudDecision(int score, String decision) {
        this.score = score;
        this.decision = decision;
    }

    public int getScore() {
        return score;
    }

    public String getDecision() {
        return decision;
    }
}
