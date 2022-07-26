package com.day3.oop;

public class Motorbike extends Vehicle {

        // Attributes
        private int engineCC;


        // Getters and Setters
        public int getEngineCC() {
                return engineCC;
        }
        public void setEngineCC(int engineCC) {
                this.engineCC = engineCC;
        }

        // Constructors
        public Motorbike() {
        }

        public Motorbike(long id, String model, int mileage, int manufactureDate, boolean insured,
                         int engineCC) {
                super(id, model, mileage, manufactureDate, insured);
                this.engineCC = engineCC;
        }
}
