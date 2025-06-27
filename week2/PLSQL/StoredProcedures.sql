
SET SERVEROUTPUT ON
-- scenario 1
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE Accounts
    SET BALANCE = BALANCE + (BALANCE* 0.01)
    WHERE ACCOUNTTYPE = 'Savings';

    DBMS_OUTPUT.PUT_LINE('Monthly interest applied to savings accounts.');

    COMMIT;
END;
/

-- Scenario 2
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_dept_name IN VARCHAR2,
    p_bonus_percent IN NUMBER
) IS
BEGIN
     UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_percent / 100)
    WHERE LOWER(DEPARTMENT) = LOWER(p_dept_name);

    DBMS_OUTPUT.PUT_LINE('Bonus of ' || p_bonus_percent || '% applied to department: ' || p_dept_name);

    COMMIT;
END;
/

-- Scenario 3
CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account_id IN NUMBER,
    p_to_account_id IN NUMBER,
    p_amount IN NUMBER
) IS
    v_balance NUMBER;
BEGIN
    -- Lock and check balance from source account
    SELECT BALANCE INTO v_balance
    FROM Accounts
    WHERE ACCOUNTID = p_from_account_id
    FOR UPDATE;

    -- Insufficient funds check
    IF v_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
    END IF;

    -- Debit source
    UPDATE Accounts
    SET BALANCE = BALANCE - p_amount,
        LastModified = SYSDATE
    WHERE ACCOUNTID = p_from_account_id;

    -- Credit destination
    UPDATE Accounts
    SET BALANCE = BALANCE + p_amount,
        LastModified = SYSDATE
    WHERE ACCOUNTID = p_to_account_id;

    DBMS_OUTPUT.PUT_LINE('Transferred ' || p_amount || ' from Account ' ||
                         p_from_account_id || ' to Account ' || p_to_account_id);

    COMMIT;
END;
/

-- the above can be executed when we execute procedures with command "exec Transferfunds(101,105,3000)"

EXIT;
