package com.day3.oop;

import java.util.ArrayList;

public class Garage {

    // Constants
    private static final double BASE_CHARGE = 10;
    private static final double BASE_MOTORBIKE = 5;
    private static final double BASE_CAR = 10;
    private static final double BASE_TRUCK = 15;


    // Attribute
    private ArrayList<Vehicle> needFixing;


    // Methods
    public double calculateBill(ArrayList<Vehicle> inGarage) {

        double bill = 0;

        for (Vehicle v : inGarage) {

            if (v instanceof Motorbike) {
                bill = BASE_CHARGE + BASE_MOTORBIKE;
                bill += (((Motorbike) v).getEngineCC() >= 150) ? 30 : 20;

            } else if (v instanceof Car) {
                bill = BASE_CHARGE + BASE_CAR;
                bill += (((Car) v).getEngineLitreSize() >= 150) ? 40 : 20;
                bill += (((Car) v).getDoors() >= 3) ? 10 : 5;

            } else if (v instanceof Truck) {
                bill = BASE_CHARGE + BASE_TRUCK;
                bill += (((Truck) v).getEngineLitreSize() >= 13) ? 75 : 40;
                bill += (((Truck) v).getAmenities().size() >= 2) ? 10 : 5;
            }
        }

        return bill;
    }

    public void addVehicle(Vehicle v) {
        needFixing.add(v);
    }

    public void removeVehicleById(long l) {
        for (Vehicle v : needFixing) {
            if (v.getId() == l) {
                needFixing.remove(v);
                break;
            }
        }
    }

    public void removeVehicleByType(String s) {
        needFixing.removeIf(v -> v.getClass().getSimpleName().equals(s));
    }

    public double fixVehicle() {
        double bill = calculateBill(needFixing);
        needFixing.clear();
        return bill;
    }
}
