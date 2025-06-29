package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {
        @Test
        public void testAdd() {
            Addition a = new Addition();
            int res = a.add(10, 20);
            assertEquals(30, res);
        }
    }
