package main.java.com.day4;


public class Factorial {

    public static String reverse(float value) {

        if (value <= 0) {
            return "NONE";
        }

        int count = 1;
        for (int i=2; value != 1; i++) {
            if (value % i == 0) {
                value /= i;
                count += 1;
            } else {
                return "NONE";
            }
        }

        return count + "!";
    }

    public static void main(String[] args) {
        System.out.println(reverse(2));
    }
}
