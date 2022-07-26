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

        public Motorbike(int engineCC) {
                super();
                this.engineCC = engineCC;
        }
}
