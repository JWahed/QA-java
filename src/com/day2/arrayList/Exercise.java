package com.day2.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise {

    public static void main(String[] args) {

        // create a new ArrayList
        ArrayList<String> arr = new ArrayList<>();

        // add() several elements
        arr.add("monkey");
        arr.add("chonkey");
        arr.add("funky");
        arr.add("donkey");

        // print out the entire ArrayList
        for (String s: arr) {
            System.out.println(s);
        }
        // iterate through the ArrayList and print out each element
        // (with both normal and enhanced for-loops)
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        // get() specific elements
        System.out.println(arr.get(1));

        // set() different elements
        arr.set(3, "wonky");

        // remove() elements
        arr.remove("funky");

        // sort() the ArrayList (try this with several object types)
        Collections.sort(arr);
        System.out.println(arr);

        ArrayList<Boolean> bool = new ArrayList<>();
        bool.add(true);
        bool.add(false);
        bool.add(true);

        Collections.sort(bool);
        System.out.println(bool);

        // try using the reverse(), swap() and clear() methods.
        Collections.reverse(arr);
        System.out.println(arr);

        Collections.swap(arr, 1, 2);
        System.out.println(arr);

        arr.clear();
        System.out.println();

        Collections.reverse(bool);
        System.out.println(bool);

        bool.clear();
        System.out.println(bool);
    }
}
