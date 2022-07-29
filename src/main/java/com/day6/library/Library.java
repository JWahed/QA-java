package com.day6.library;

import java.util.List;


public class Library {

    private static List<Items> allItems;
    private static List<Items> loanedItems;
    private static List<Person> users;


    public static List<Items> getAllItems() {
        return allItems;
    }

    public static void setAllItems(List<Items> allItems) {
        Library.allItems = allItems;
    }

    public static List<Items> getLoanedItems() {
        return loanedItems;
    }

    public static void setLoanedItems(List<Items> loanedItems) {
        Library.loanedItems = loanedItems;
    }

    public static List<Person> getUsers() {
        return users;
    }

    public static void setUsers(List<Person> users) {
        Library.users = users;
    }


    public Library() {
    }
}
