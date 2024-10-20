package com.techelevator.model;

public class Country {

    private final int countryId;
    private final String countryName;


    public Country(int countryId, String countryName) {
        this.countryId = countryId;
        this.countryName = countryName;
    }

    public int getCountryId() {
        return countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public String toString() {
        return "Country|" +
                "country Id= " + countryId +
                ", country name= '" + countryName + '\'' +
                '|';
    }
}
