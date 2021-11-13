package testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CountTest {

    @Test
    public void count() {
        JunitTesting test = new JunitTesting();
        int output = test.count("alabama");
        assertEquals(4, output);
    }
}