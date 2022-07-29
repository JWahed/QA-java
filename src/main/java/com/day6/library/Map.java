package com.day6.library;


public class Map extends Items {

    private String name;
    private String country;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public Map() {}

    public Map(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Maps{" +
                "Name of Map: '" + name + '\'' +
                ", Country: '" + country + '\'' +
                '}';
    }
}
