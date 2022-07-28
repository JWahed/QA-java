package com.day5;

import static java.lang.Math.random;


public class RockPaperScissors {

    private enum Action {
        ROCK,
        PAPER,
        SCISSORS
    }

    private enum Result {
        WIN,
        LOSE,
        DRAW
    }


    public static Action computerAction() {
        double random = random();
        Action a = null;

        if (random >= 0.66) {
            a = Action.ROCK;
        } else if (random >= 0.33 && random < 0.66) {
            a = Action.PAPER;
        } else {
            a = Action.SCISSORS;
        }

        return a;
    }

    public static Result rpsGame(Action e) {
        Action c = computerAction();
        System.out.printf(
                "Your move: %s\n",
                e.name().substring(0,1) +
                e.name().substring(1).toLowerCase()
        );
        System.out.printf(
                "Computer's move: %s\n",
                c.name().substring(0,1) +
                c.name().substring(1).toLowerCase()
        );

        if (e == c) {
            return Result.DRAW;
        } else if (e == Action.PAPER && c == Action.ROCK) {
            return Result.WIN;
        } else if (e == Action.SCISSORS && c == Action.PAPER) {
            return Result.WIN;
        } else if (e == Action.ROCK && c == Action.SCISSORS) {
            return Result.WIN;
        } else {
            return Result.LOSE;
        }
    }

    public static void main(String[] args) {
        System.out.println(rpsGame(Action.PAPER));
    }
}
