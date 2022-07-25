package com.day2.oop;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        // Create some example objects with this class.
        Person p1 = new Person("John", 45, "Accounts manager");
        Person p2 = new Person("Jim", 18, "Trainee");
        Person p3 = new Person("Jakob", 23, "Trainee");
        Person p4 = new Person("James", 30, "Senior developer");
        Person p5 = new Person("Jeffrey", 35, "Tech lead");

        // Create a List<> implementation and store those objects inside.
        ArrayList<Person> people = new ArrayList<>();

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);

        // Create a method that can search for a specific Person by their name.
        Person.findByName("Jakob", people);
    }
}
