package com.day6.library;

public abstract class Items<I extends > {

    private static int idCounter = 1;
    private int id = idCounter++;

    public int getId() {
        return id;
    }

}
