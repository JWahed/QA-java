package com.day3.oop;

public class Vehicle {

    // Attributes
    private long id;
    private String model;
    private int mileage;


    private int manufactureDate;
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

    public int getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(int manufactureDate) {
        this.manufactureDate = manufactureDate;
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
    public Vehicle(long id, String model, int mileage, int manufactureDate, boolean insured) {
        this.id = id;
        this.model = model;
        this.mileage = mileage;
        this.manufactureDate = manufactureDate;
        this.insured = insured;
    }
}
