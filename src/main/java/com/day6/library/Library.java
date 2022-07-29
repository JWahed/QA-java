package com.day6.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Library {

    private static List<Items> allItemsList = new ArrayList<>();
    private static List<Items> loanedItemsList = new ArrayList<>();
    private static List<Person> usersList = new ArrayList<>();


    public static List<Items> getAllItemsList() {
        return allItemsList;
    }

    public static void setAllItemsList(List<Items> allItemsList) {
        Library.allItemsList = allItemsList;
    }

    public static List<Items> getLoanedItemsList() {
        return loanedItemsList;
    }

    public static void setLoanedItemsList(List<Items> loanedItemsList) {
        Library.loanedItemsList = loanedItemsList;
    }

    public static List<Person> getUsersList() {
        return usersList;
    }

    public static void setUsersList(List<Person> usersList) {
        Library.usersList = usersList;
    }


    public Library() {
    }


    public static String itemCheckIn(Items item) {
        if (allItemsList.contains(item) && loanedItemsList.contains(item)) {
            loanedItemsList.remove(item);
            usersList.removeIf(p -> p.getItemsLoaned().remove(item));
            return String.format("Item check in successful for item %d", item.getId());

        } else if (allItemsList.contains(item) && !loanedItemsList.contains(item)) {
            return "Item can not be checked in as it was not checked out";

        } else if (!allItemsList.contains(item)) {
            return "Item does not exist";

        } else {
            return "Check in failed!";
        }
    }

    // Overloaded method won't have to search entire user list for who borrowed item
    public static String itemCheckIn(Person person, Items item) {
        if (!usersList.contains(person)) {
            return String.format("%s %s is not a registered user!",
                    person.getFirstName(), person.getLastName()
            );

        } else if (allItemsList.contains(item) && loanedItemsList.contains(item)) {
            loanedItemsList.remove(item);
            person.getItemsLoaned().remove(item);
            return String.format("Item check in successful for item %d", item.getId());

        } else if (allItemsList.contains(item) && !loanedItemsList.contains(item)) {
            return "Item can not be checked in as it was not checked out";

        } else if (!allItemsList.contains(item)) {
            return "Item does not exist";

        } else {
            return "Check in failed!";
        }
    }

    public static String itemCheckOut(Person person, Items item) {
        if (!usersList.contains(person)) {
            return String.format("%s %s is not a registered user!",
                                  person.getFirstName(), person.getLastName()
            );

        } else if (allItemsList.contains(item) && !loanedItemsList.contains(item)) {
            loanedItemsList.add(item);
            person.getItemsLoaned().add(item);
            return String.format("%s %s successfully checked out item with id %d!",
                                  person.getFirstName(), person.getLastName(), item.getId()
            );

        } else if (allItemsList.contains(item) && loanedItemsList.contains((item))) {
            return String.format("Item with id %d is already checked out", item.getId());

        } else if (!allItemsList.contains(item)) {
            return "Item does not exist in our library, must be added first";

        } else {
            return "Checkout failed!";
        }
    }

    public static String addItemToLibrary(Items item) {
        if (!allItemsList.contains(item)) {
            allItemsList.add(item);
            return "Item successfully added";

        } else if (allItemsList.contains(item)) {
            return "Item already exists in library";

        } else {
            return "Adding item to library failed";
        }
    }

    public static String removeItemFromLibrary(Items item) {
        if (allItemsList.contains(item)) {
            allItemsList.remove(item);
            loanedItemsList.remove(item);
            return "Item successfully removed";

        } else if (!allItemsList.contains(item)) {
            return "Item does not exist";

        } else {
            return "Removing item failed";
        }
    }

    public static String registerUser(Person person) {
        if (!usersList.contains(person)) {
            usersList.add(person);
            return String.format("Person (%s %s) successfully added",
                                  person.getFirstName(), person.getLastName()
            );

        } else if (usersList.contains(person)) {
            return "Person already exists in usersList";

        } else {
            return "Registration failed";
        }
    }

    public static String deleteUser(Person person) {
        if (usersList.contains(person) && person.getItemsLoaned().isEmpty()) {
            String s = person.getFirstName() + " " + person.getLastName();
            usersList.remove(person);
            return String.format("%s has been removed", s);

        } else if (!usersList.contains(person)) {
            return "This person does not exist in usersList";

        } else if (!person.getItemsLoaned().isEmpty()) {
            return "This person can not be deleted as they have unchecked in items";

        } else {
            return "Deletion failed";
        }
    }

    public static String updateUserFirstName(Person person, String newFirstName) {
        if (person.getFirstName().equals(newFirstName)) {
            return "You are trying to change this peron's firs name to their current first name";

        } else if (usersList.contains(person)) {
            person.setFirstName(newFirstName);
            return "Successfully updated first name!";

        } else if (!usersList.contains(person)){
            return "Person does not exist!";

        } else {
            return "First name update failed!";
        }
    }

    public static String updateUserLastName(Person person, String newLastName) {
        if (person.getLastName().equals(newLastName)) {
            return "You are trying to change this peron's last name to their current last name";

        } else if (usersList.contains(person)) {
            person.setLastName(newLastName);
            return "Successfully updated last name!";

        } else if (!usersList.contains(person)){
            return "Person does not exist!";

        } else {
            return "Last name update failed!";
        }
    }

    public static String updateUserDOB(Person person, LocalDate dob) {

        if (person.getDob().equals(dob)) {
            return "You are trying to change the date of birth to the same date of birth";

        } else if (usersList.contains(person)) {
            person.setDob(dob);
            return "Successfully updated date of birth name!";

        } else if (!usersList.contains(person)){
            return "Person does not exist in users list";

        } else {
            return "Date of birth update failed!";
        }
    }

}
