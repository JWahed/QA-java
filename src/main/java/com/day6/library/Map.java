package com.day6.library;


public class Map extends Items {


    private final int id = this.getId();
    private String country;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public Map() {}

    public Map(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return  "\nMap {" +
                "Item id: '" + id + '\'' +
                ", Map of: " + country +
                '}';
    }
}
