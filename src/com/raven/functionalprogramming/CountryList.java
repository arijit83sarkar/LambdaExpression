package com.raven.functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountryList {
    public static List<Country> getCountryList() {
        List<Country> countryList = new ArrayList<>();

        Country country = new Country("South Africa", 5080,
                Arrays.asList("Cap Town", "Johannesburg", "Durban", "Pretoria"));
        countryList.add(country);

        country = new Country("Germany", 3000,
                Arrays.asList("Berlin", "Hamburg", "Munich", "Stuttgart"));
        countryList.add(country);

        country = new Country("Brazil", 8090,
                Arrays.asList("Sao Paulo", "Rio de Janeiro", "Brasília", "Fortaleza"));
        countryList.add(country);

        country = new Country("Argentina", 6500,
                Arrays.asList("Buenos Aires", "Córdoba", "Rosario", "La Plata"));
        countryList.add(country);

        return countryList;
    }
}

class Country {
    String name;
    int population;
    List<String> ctyName;

    public Country(String name, int population, List<String> ctyName) {
        this.name = name;
        this.population = population;
        this.ctyName = ctyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<String> getCtyName() {
        return ctyName;
    }

    public void setCtyName(List<String> ctyName) {
        this.ctyName = ctyName;
    }

    @Override
    public String toString() {
        return "Country [name=" + name + ", population=" + population + ", ctyName=" + ctyName + "]";
    }

}