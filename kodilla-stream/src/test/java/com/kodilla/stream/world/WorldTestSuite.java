package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        World world = new World();

        Country country1 = new Country("Bangladesz", new BigDecimal("2000"));
        Country country2 = new Country("Bhutan", new BigDecimal("2000"));
        Country country3 = new Country("Brunei", new BigDecimal("2000"));
        Country country4 = new Country("Chiny", new BigDecimal("2000"));
        Country country5 = new Country("Korea", new BigDecimal("2000"));
        Country country11 = new Country("Polska", new BigDecimal("2000"));
        Country country12 = new Country("Niemcy", new BigDecimal("2000"));
        Country country13 = new Country("Czechy", new BigDecimal("2000"));
        Country country14 = new Country("Holandia", new BigDecimal("2000"));
        Country country15 = new Country("Slowacja", new BigDecimal("2000"));
        Country country21 = new Country("Walia", new BigDecimal("2000"));
        Country country22 = new Country("Tasmania", new BigDecimal("2000"));
        Country country23 = new Country("Australia Zachodnia", new BigDecimal("2000"));
        Country country24 = new Country("Queensland", new BigDecimal("2000"));
        Country country25 = new Country("Tonga", new BigDecimal("2000"));

        Continent Asia = new Continent("Azja");
        Continent Europe = new Continent("Europa");
        Continent Australia = new Continent("Australia");

        Asia.countryList.add(country1);
        Asia.countryList.add(country2);
        Asia.countryList.add(country3);
        Asia.countryList.add(country4);
        Asia.countryList.add(country5);
        Europe.countryList.add(country11);
        Europe.countryList.add(country12);
        Europe.countryList.add(country13);
        Europe.countryList.add(country14);
        Europe.countryList.add(country15);
        Australia.countryList.add(country21);
        Australia.countryList.add(country22);
        Australia.countryList.add(country23);
        Australia.countryList.add(country24);
        Australia.countryList.add(country25);

        world.continentList.add(Asia);
        world.continentList.add(Europe);
        world.continentList.add(Australia);

        BigDecimal condition = new BigDecimal(30000);

        Assert.assertEquals(condition, world.getPeopleQuantity());

    }
}
