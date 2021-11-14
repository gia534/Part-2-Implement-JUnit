package testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

    @Test
    void divide() {
        JunitTesting test = new JunitTesting();
        int correctOutput = (int) test.divide(-6, 3);
        assertEquals(-2, correctOutput);

//        int wrongOutput = (int) test.divide(6, 3);
//        assertEquals(-2, wrongOutput);


    }
}