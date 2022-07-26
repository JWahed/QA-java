package com.day3.oop;

public class Car extends Vehicle {

    // Attributes
    private String engineType;
    private double engineLitreSize;
    private int doors;


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

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }


    // Constructors
    public Car() {
        super();
    }

    public Car(long id, String model, int mileage, int manufactureDate, boolean insured,
               String engineType, int engineLitreSize, int doors) {
        super(id, model, mileage, manufactureDate, insured);
        this.engineType = engineType;
        this.engineLitreSize = engineLitreSize;
        this.doors = doors;
    }
}
