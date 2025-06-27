SET SERVEROUTPUT ON;

BEGIN
    -- Scenario 1: Customers over 60 with loans
    DBMS_OUTPUT.PUT_LINE('Scenario 1:');

    FOR rec IN (
        SELECT l.CUSTOMERID, l.LOANID, l.INTERESTRATE
        FROM LOANS l
        JOIN CUSTOMERS c ON l.CUSTOMERID = c.CUSTOMERID
        WHERE MONTHS_BETWEEN(SYSDATE, c.DOB) / 12 > 60
    ) LOOP
        UPDATE LOANS
        SET INTERESTRATE = INTERESTRATE - 1
        WHERE LOANID = rec.LOANID;

        DBMS_OUTPUT.PUT_LINE('Discount applied to Customer: ' || rec.LOANID || ' for CustomerID: ' || rec.CUSTOMERID);
    END LOOP;

    -- Scenario 2: Promote VIPs
    DBMS_OUTPUT.PUT_LINE('Scenario 2:');

    FOR vip_rec IN (
        SELECT CUSTOMERID, NAME, BALANCE
        FROM CUSTOMERS
        WHERE BALANCE > 10000
    ) LOOP
        UPDATE CUSTOMERS
        SET ISVIP = 'Y'
        WHERE CUSTOMERID = vip_rec.CUSTOMERID;

        DBMS_OUTPUT.PUT_LINE('Customers who Promoted to VIP: ' || vip_rec.NAME || ' | Balance: ' || vip_rec.BALANCE);
    END LOOP;

    -- Scenario 3: Print loan due reminders
    DBMS_OUTPUT.PUT_LINE('Scenario 3:');

    FOR due_rec IN (
        SELECT l.CUSTOMERID, l.LOANID, l.ENDDATE, c.NAME
        FROM LOANS l
        JOIN CUSTOMERS c ON l.CUSTOMERID = c.CUSTOMERID
        WHERE l.ENDDATE BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: LoanID ' || due_rec.LOANID || ' for ' || due_rec.NAME || 
                             ' is due on ' || TO_CHAR(due_rec.ENDDATE, 'DD-Mon-YYYY'));
    END LOOP;

    COMMIT;
END;
/
