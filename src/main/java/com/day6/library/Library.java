package com.day6.library;

import java.util.List;


public class Library {


    private static List<Items> allBooks;
    private static List<Items> loanedBooks;
    private static List<Person> users;


    public static List<Items> getAllBooks() {
        return allBooks;
    }

    public static void setAllBooks(List<Items> allBooks) {
        Library.allBooks = allBooks;
    }

    public static List<Items> getLoanedBooks() {
        return loanedBooks;
    }

    public static void setLoanedBooks(List<Items> loanedBooks) {
        Library.loanedBooks = loanedBooks;
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
