package testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    public void square() {
        JunitTesting test = new JunitTesting();
        int output = test.square(5);

        assertEquals(25, output);
    }
}