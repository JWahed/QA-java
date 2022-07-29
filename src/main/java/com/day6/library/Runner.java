package com.day6.library;

import java.time.LocalDate;

public class Runner {

    public static void main(String[] args) {

        Library lib = new Library();

        Person p1 = new Person("James", "John", LocalDate.of(2009,12,4));
        Person p2 = new Person("Adam", "Smith", LocalDate.of(1999,5,30));
        Person p3 = new Person("Abdul", "Rahman", LocalDate.of(2003,5,13));
        Person p4 = new Person("Muhammed", "Hussain", LocalDate.of(2009,4,5));
        Person p5 = new Person("Han", "Ting", LocalDate.of(1986,9,10));

        Book b1 = new Book("The Da Vinci Code", "Dan Brown", "Doubleday", "0-385-50420-9 ", GenreEnum.Genre.FICTION);
        Book b2 = new Book("The Girl with the Dragon Tattoo", "Stieg Larsson", "Norstedts Förlag", "978-1-84724-253-2", GenreEnum.Genre.FICTION);
        Book b3 = new Book("In Cold Blood", "Truman Capote", "Random House", "0-679-74558-0", GenreEnum.Genre.NONFICTION);
        Book b4 = new Book("Harry Potter and the Goblet of Fire", "J.K.Rowling", "Bloomsbury", "0-7475-4624-X", GenreEnum.Genre.FICTION);
        Book b5 = new Book("Milk and Honey", "Rupi Kaur", "Andrews McMeel Publishing", "9781449496364", GenreEnum.Genre.POETRY);

        Newspaper np1 = new Newspaper("Daily Mail", LocalDate.of(2021, 11, 30), false);
        Newspaper np2 = new Newspaper("Telegraph", LocalDate.of(2022, 06, 16), true);
        Newspaper np3 = new Newspaper("Metro", LocalDate.of(2022, 5, 2), false);

        Map m1 = new Map("United Kingdom");
        Map m2 = new Map("USA");
        Map m3 = new Map("China");
        Map m4 = new Map("Sweden");

    }
}
