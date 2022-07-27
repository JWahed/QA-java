package com.day1.iteration;

public class Flowcharts {

    public static void main(String[] args) {
        flow1();
        flow2();
        oneToTen();
        nums();
    }

    // flowchart 1
    public static void flow1() {

        for (int a = 100; a <= 200; a++) {
            System.out.println(a);
        }
    }
    // flowchart 2
    public static void flow2() {

        for (int a = 100; a <= 200; a++) {
            if (a%2 ==0) {
                System.out.println("-");
            } else {
                System.out.println("*");
            }
        }
    }

    public static void oneToTen() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void nums() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i);
            }
        }
    }
}
