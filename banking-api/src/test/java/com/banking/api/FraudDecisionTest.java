package com.banking.api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FraudDecisionTest {

    @Test
    void shouldReturnReviewDecision() {

        FraudDecision result =
            new FraudDecision(40, "REVIEW");

        assertEquals(40, result.getScore());
        assertEquals("REVIEW", result.getDecision());
    }
        @Test
    void shouldDeclineHighRiskTransaction() {

        HealthController controller = new HealthController();

        FraudDecision result = controller.score(85);

        assertEquals(85, result.getScore());
        assertEquals("DECLINE", result.getDecision());
    }
@Test
void shouldAllowLowRiskTransaction() {

        HealthController controller = new HealthController();

        FraudDecision result = controller.score(29);

        assertEquals(29, result.getScore());
        assertEquals("ALLOW", result.getDecision());
    }
@Test
void shouldReviewAtLowerBoundary() {

        HealthController controller = new HealthController();

        FraudDecision result = controller.score(30);

        assertEquals(30, result.getScore());
        assertEquals("REVIEW", result.getDecision());
    }   
}