package test.java;

import main.java.com.day4.Doggo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class DoggoTest {

    @Test
    void DoggoTestSize() {
        String[] testArr1 = new String[100];
        String[] testArr2 = new String[99];

        assertEquals(Doggo.position(0).size(), testArr1.length);
        assertEquals(Doggo.position(1).size(), testArr2.length);
        assertEquals(Doggo.position(100).size(), testArr2.length);
        assertEquals(Doggo.position(101).size(), testArr1.length);
    }
    @Test
    void DoggoTestPosition() {

        ArrayList<String> testArr1= new ArrayList<>();
        testArr1.add("1st");
        testArr1.add("42nd");
        testArr1.add("73rd");
        testArr1.add("80th");

        assertTrue(Doggo.position(0).containsAll(testArr1));
        assertTrue(Doggo.position(55).containsAll(testArr1));
        assertTrue(Doggo.position(101).containsAll(testArr1));

        assertFalse(Doggo.position(1).contains(testArr1.get(0)));
        assertFalse(Doggo.position(42).contains(testArr1.get(1)));
        assertFalse(Doggo.position(73).contains(testArr1.get(2)));
        assertFalse(Doggo.position(80).contains(testArr1.get(3)));
    }
}
