package com.day5.hashmaps;

import java.util.*;
import java.util.stream.Collectors;


public class MorseCodeTranslator {

    private final HashMap<String, String> MORSE_MAP;

    public MorseCodeTranslator(){
        this.MORSE_MAP = new HashMap<>();

        this.MORSE_MAP.put(".-", "a");
        this.MORSE_MAP.put("-...", "b");
        this.MORSE_MAP.put("-.-.", "c");
        this.MORSE_MAP.put("-..", "d");
        this.MORSE_MAP.put(".", "e");
        this.MORSE_MAP.put("..-.", "f");
        this.MORSE_MAP.put("--.", "g");
        this.MORSE_MAP.put("....", "h");
        this.MORSE_MAP.put("..", "i");
        this.MORSE_MAP.put(".---", "j");
        this.MORSE_MAP.put("-.-", "k");
        this.MORSE_MAP.put(".-..", "l");
        this.MORSE_MAP.put("--", "m");
        this.MORSE_MAP.put("-.", "n");
        this.MORSE_MAP.put("---", "o");
        this.MORSE_MAP.put(".--.", "p");
        this.MORSE_MAP.put("--.-", "q");
        this.MORSE_MAP.put(".-.", "r");
        this.MORSE_MAP.put("...", "s");
        this.MORSE_MAP.put("-", "t");
        this.MORSE_MAP.put("..-", "u");
        this.MORSE_MAP.put("...-", "v");
        this.MORSE_MAP.put(".--", "w");
        this.MORSE_MAP.put("-..-", "x");
        this.MORSE_MAP.put("-.--", "y");
        this.MORSE_MAP.put("--..", "z");

        this.MORSE_MAP.put("-----", "0");
        this.MORSE_MAP.put(".----", "1");
        this.MORSE_MAP.put("..---", "2");
        this.MORSE_MAP.put("...--", "3");
        this.MORSE_MAP.put("....-", "4");
        this.MORSE_MAP.put(".....", "5");
        this.MORSE_MAP.put("-....", "6");
        this.MORSE_MAP.put("--...", "7");
        this.MORSE_MAP.put("---..", "8");
        this.MORSE_MAP.put("----.", "9");

        this.MORSE_MAP.put("/", " ");
    }


    public String translate(String s) {
        return Arrays.stream(s.split(" "))
                .map(x -> this.MORSE_MAP.get(x))
                .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        MorseCodeTranslator translator = new MorseCodeTranslator();
        System.out.println(translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
    }

}
