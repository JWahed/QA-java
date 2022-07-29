package com.day6.library;

import java.time.LocalDate;
import java.util.List;


public class Person {

    private String firstName;
    private String lastName;
    private LocalDate dob;
    private List<Items> itemsLoaned;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public List<Items> getItemsLoaned() {
        return itemsLoaned;
    }

    public void setItemsLoaned(List<Items> itemsLoaned) {
        this.itemsLoaned = itemsLoaned;
    }


    public Person() {}

    public Person(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public Person(String firstName, String lastName, LocalDate dob, List<Items> itemsLoaned) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.itemsLoaned = itemsLoaned;
    }

    @Override
    public String toString() {
        return "Personal information {" +
                "First name: '" + firstName + '\'' +
                ", Last name: '" + lastName + '\'' +
                ", Date of birth: " + dob +
                ", Items currently loaned: " + itemsLoaned +
                '}';
    }

}
