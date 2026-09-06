CREATE OR REPLACE FUNCTION GET_TRANSACTION_VELOCITY (
    p_transaction_id IN NUMBER
)
RETURN NUMBER
IS
    v_transaction_count NUMBER;
BEGIN
    SELECT COUNT(*)
    INTO v_transaction_count
    FROM TRANSACTIONS T
    WHERE T.RESULT = 'SUCCESS'
      AND T.TR_DATE >= (
            SELECT A.TR_DATE
            FROM TRANSACTIONS A
            WHERE A.TRANSACTION_ID = p_transaction_id
          ) - 10/1440
      AND T.TR_DATE <= (
            SELECT A.TR_DATE
            FROM TRANSACTIONS A
            WHERE A.TRANSACTION_ID = p_transaction_id
          )
      AND T.ACCOUNT_ID = (
            SELECT A.ACCOUNT_ID
            FROM TRANSACTIONS A
            WHERE A.TRANSACTION_ID = p_transaction_id
          );

    RETURN v_transaction_count;
END;
/