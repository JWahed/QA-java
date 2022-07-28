package test.java;

import main.java.com.day4.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    void reverseTest() {
        assertEquals("NONE", Factorial.reverse(0));
        assertEquals("1!", Factorial.reverse(1));
        assertEquals("2!", Factorial.reverse(2));
        assertEquals("NONE", Factorial.reverse(3));
        assertEquals("3!", Factorial.reverse(6));
        assertEquals("NONE", Factorial.reverse(18));
        assertEquals("5!", Factorial.reverse(120));
        assertEquals("10!", Factorial.reverse(3628800));
        assertEquals("12!", Factorial.reverse(479001600));

    }
}
