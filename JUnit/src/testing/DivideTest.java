package testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

    @Test
    void divide() {
        JunitTesting test = new JunitTesting();
        int output = (int) test.divide(-6, 3);
        assertEquals(-2, output);

        int positiveNum = (int) test.divide(10, 5);
        assertEquals(2, positiveNum);

        int zero = (int) test.divide(9, 0);
        assertEquals(0, zero);
    }
}