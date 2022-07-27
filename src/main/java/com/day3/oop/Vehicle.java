package com.day3.oop;

public abstract class Vehicle {

    // Attributes
    private long id;
    private String model;
    private int mileage;
    private int manufactureYear;
    private boolean insured;


    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public boolean isInsured() {
        return insured;
    }

    public void setInsured(boolean insured) {
        this.insured = insured;
    }

    // Constructor
    public Vehicle() {

    }
    public Vehicle(long id, String model, int mileage, int manufactureYear, boolean insured) {
        this.id = id;
        this.model = model;
        this.mileage = mileage;
        this.manufactureYear = manufactureYear;
        this.insured = insured;
    }
}
