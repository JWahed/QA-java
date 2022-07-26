package com.day3.oop;

import java.util.ArrayList;

public class Truck extends Vehicle {

    // Attributes
    public String engineType;
    public double engineLitreSize;
    private ArrayList<String> amenities;


    // Getters and Setters
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getEngineLitreSize() {
        return engineLitreSize;
    }

    public void setEngineLitreSize(int engineLitreSize) {
        this.engineLitreSize = engineLitreSize;
    }

    public ArrayList<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(ArrayList<String> amenities) {
        this.amenities = amenities;
    }


    // Constructors
    public Truck() {

    }

    public Truck(long id, String model, int mileage, int manufactureYear, boolean insured,
                 String engineType, int engineLitreSize, ArrayList<String> amenities) {
        super(id, model, mileage, manufactureYear, insured);
        this.engineType = engineType;
        this.engineLitreSize = engineLitreSize;
        this.amenities = amenities;
    }
}
