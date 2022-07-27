package com.day1.arrays;

public class Numbers {

    public static String wordify(int num) {

        final String[] lessTeens = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                                     "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                                    "seventeen", "eighteen", "nineteen"};

        final String[] tenMultiples = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
                                        "eighty", "ninety"};

        String s = "";
        int check = 0;

        if (num < 20) {
            s = lessTeens[num];
            check = 1;
        }
        if (num >= 20 && num < 100) {
            s = String.format(
                            "%s %s",
                            tenMultiples[(num % 100)/ 10],
                            lessTeens[(num % 10)]
            );
            check = 1;
        }
        if (num >= 100 && num < 1000) {
            s = String.format(
                            "%s hundred %s %s",
                            lessTeens[(num % 1000)/ 100],
                            tenMultiples[(num % 100)/ 10],
                            lessTeens[num % 10]);
            check = 1;
        }
        if (num >= 1000 && num < 10000) {
            s = String.format(
                            "%s thousand %s hundred %s %s",
                            lessTeens[(num % 10000) / 1000],
                            lessTeens[(num % 1000)/ 100],
                            tenMultiples[(num % 100)/ 10],
                            lessTeens[num % 10]
            );
            check = 1;
        }

        if (check == 1) return s;
        return "invalid input";

    }

    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++) {
            System.out.println(wordify(i));
        }
    }
}

