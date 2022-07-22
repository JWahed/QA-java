package com.day1.iteration;

public class Coins {

    public static void main(String[] args) {
        System.out.println(change(48.99, 100));
    }

    public static String change(double cost, double given) {

        int twentyNote = 0;
        int tenNote = 0;
        int fiveNote = 0;
        int twoPoundCoin = 0;
        int poundCoin = 0;
        int fiftyCoin = 0;
        int twentyCoin = 0;
        int tenCoin = 0;
        int fiveCoin = 0;
        int twoCoin = 0;
        int oneCoin = 0;

        given = given - cost;

        while (given > 0) {
            if (given >= 20) {
                twentyNote += 1;
                given -= 20;
            }
            if (given < 20 && given >= 10) {
                tenNote += 1;
                given -= 10;
            }
            if (given < 10 && given >= 5) {
                fiveNote += 5;
                given -= 5;
            }
            if (given < 5 && given >= 2) {
                twoPoundCoin += 1;
                given -= 2;
            }
            if (given < 2 && given >= 1) {
                poundCoin += 1;
                given -= 1;
            }
            if (given < 1 && given >= 0.5) {
                fiftyCoin += 1;
                given -= 0.5;
            }
            if (given < 0.5 && given >= 0.2) {
                twentyCoin += 1;
                given -= 0.2;
            }
            if (given < 0.2 && given >= 0.1) {
                tenCoin += 1;
                given -= 0.1;
            }
            if (given < 0.1 && given >= 0.05) {
                fiveCoin += 1;
                given -= 0.05;
            }
            if (given < 0.05 && given >= 0.02) {
                twoCoin += 1;
                given -= 0.02;
            }
            if (given < 0.02) {
                oneCoin += 1;
                given -= 0.01;
            }
        }
        return String.format("Your change: \n " +
                            "%d twenties\n "  +
                            "%d tenners\n " +
                            "%d fivers\n " +
                            "%d two pound coins\n " +
                            "%d one pound coins\n " +
                            "%d fifty pence coins\n " +
                            "%d twenty pence coins \n "+
                            "%d ten pence coins\n "+
                            "%d five pence coins\n " +
                            "%d two pence coins\n " +
                            "%d one pence coins \n ",
                            twentyNote, tenNote, fiveNote, twoPoundCoin, poundCoin,
                            fiftyCoin, twentyCoin, tenCoin, fiveCoin, twoCoin, oneCoin);
    }
}
