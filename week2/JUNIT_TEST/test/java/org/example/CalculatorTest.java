package org.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest{

        private Calculator cal;
        @BeforeEach
        public void setUp() {
            cal = new Calculator();
        }
        @AfterEach
        public void tearDown() {
            cal = null;
        }
        @Test
        public void testAddition() {
            int res = cal.add(20, 5);
            assertEquals(25, res);
        }
        @Test
        public void testSubtraction(){
            int res = cal.subtract(20,5);
            assertEquals(15, res);
        }
        @Test
        public void testMultiplication() {
            int res = cal.multiply(20, 5);
            assertEquals(100, res);
        }
        @Test
        public void testDivision() {
            int res = cal.divide(20, 5);
            assertEquals(4, res);

        }    }