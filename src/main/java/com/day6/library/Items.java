package com.day6.library;

public abstract class Items {

    private static int idCounter = 1;
    private int id = idCounter++;

    public int getId() {
        return id;
    }

}
