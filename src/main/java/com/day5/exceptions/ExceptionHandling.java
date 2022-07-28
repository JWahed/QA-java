package com.day5.exceptions;

public class ExceptionHandling {

    public static int divide(int x, int y) {
        int result = 0;

        try {
            result = x / y;
        } catch (ArithmeticException ae) {
            System.out.println("Can not divide by 0");
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(divide(1, 0));
    }
}
