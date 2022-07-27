package test.java;

import main.java.com.day4.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    void reverseTest() {
        assertEquals(Factorial.reverse(0), "NONE");
        assertEquals(Factorial.reverse(1), "1!");
        assertEquals(Factorial.reverse(2), "2!");
        assertEquals(Factorial.reverse(3), "NONE");
        assertEquals(Factorial.reverse(6), "3!");
        assertEquals(Factorial.reverse(18), "NONE");
        assertEquals(Factorial.reverse(120), "5!");
        assertEquals(Factorial.reverse(3628800), "10!");
        assertEquals(Factorial.reverse(479001600), "12!");

    }
}
