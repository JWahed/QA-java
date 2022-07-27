package com.day2.oop;

import java.util.List;

public class Person {

    // Create a Person class modelling name, age and job title variables.
    private String name;
    private int age;
    private String jobTitle;

    // Getters and Setters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getJobTitle() { return jobTitle; }
    public void setName(String n) { this.name = n; }
    public void setAge(int i) { this.age = i; }
    public void setJobTitle(String j) { this.name = j; }

    // All args constructor
    public Person(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    // Create a method to return all three of these in a formatted string.
    public String toString() {
        return String.format("Name: %s\nAge: %d\nJob Title: %s\n", this.name, this.age, this.jobTitle);
    }

    // Create a method that can search for a specific Person by their name.
    public static Person findByName(String name, List<Person> persons) {
        for (Person p: persons) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }
}
