package test.java;

import main.java.com.day4.Doggo;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class DoggoTest {

    @Test
    void DoggoTestSize() {
        String[] testArr1 = new String[100];
        String[] testArr2 = new String[99];

        assertEquals(testArr1.length, Doggo.position(0).size());
        assertEquals(testArr2.length, Doggo.position(1).size());
        assertEquals(testArr2.length, Doggo.position(100).size());
        assertEquals(testArr1.length, Doggo.position(101).size());
    }
    @Test
    void DoggoTestPosition() {

        ArrayList<String> testArr1= new ArrayList<>();
        testArr1.add("1st");
        testArr1.add("11th");
        testArr1.add("12th");
        testArr1.add("13th");
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
