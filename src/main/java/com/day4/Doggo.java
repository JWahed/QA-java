package main.java.com.day4;

import java.util.ArrayList;


public class Doggo {

    public static ArrayList<String> position(int x) {

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {

            arr.add(String.valueOf(i));

            int j = i-1;
            String s = arr.get(j);
            if (s.endsWith("1")) {
                arr.set(j, s + "st");
            } else if (s.endsWith("2")) {
                arr.set(j, s + "nd");
            } else if (s.endsWith("3")) {
                arr.set(j, s + "rd");
            } else {
                arr.set(j, s + "th");
            }
        }
        if (x < 1 || x > 100) {
            return arr;
        }
        arr.remove(x-1);
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(position(10));

    }
}
