DECLARE
    v_transaction_id NUMBER := 86;
    v_rule_id        NUMBER;
    v_score          NUMBER;

BEGIN
    IF GET_TRANSACTION_VELOCITY(v_transaction_id) > 3 THEN

        SELECT RULE_ID, SCORE
        INTO v_rule_id, v_score
        FROM FRAUD_RULES
        WHERE RULE_CODE = 'HIGH_TRANSACTION_VELOCITY'
          AND STATUS = 'ACTIVE';

        INSERT INTO FRAUD_RULE_HITS (
            TRANSACTION_ID,
            RULE_ID,
            SCORE_APPLIED
        )
        VALUES (
            v_transaction_id,
            v_rule_id,
            v_score
        );

    END IF;
END;

/