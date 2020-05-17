package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Continent {
    private final String continentName;

    public final List<Country> countryList = new ArrayList<Country>();

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(continentName, continent.continentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continentName);
    }
}
