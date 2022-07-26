package com.day2.oop;

import java.util.List;

public class Person {

    // Create a Person class modelling name, age and job title variables.
    private String name;
    private int age;
    private String jobTitle;

    public String getName() {
        return name;
    }

    public Person(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }
    // Create a method to return all three of these in a formatted string.
    public String toString() {
        return String.format("Name: %s\nAge: %d\nJob Title: %s\n", this.name, this.age, this.jobTitle);
    }
    public static Person findByName(String name, List<Person> persons) {
        for (Person p: persons) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }
}
