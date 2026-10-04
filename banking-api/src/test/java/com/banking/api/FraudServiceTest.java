package com.banking.api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FraudServiceTest {
    @Test
    void shouldReviewMediumRiskTransaction() {
            FraudService service = new FraudService();

            FraudDecision result = service.calculateDecision(40);

            assertEquals("REVIEW", result.getDecision());
        }

        
}