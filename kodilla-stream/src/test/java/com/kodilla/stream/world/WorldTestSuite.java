package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        World world = new World();
        Continent continent = new Continent();

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
        Country country25 = new Country("Tonga",new BigDecimal("2000"));

        Continent Asia = new Continent(country1, country2, country3, country4, country5, "Asia");
        Continent Europe = new Continent(country11, country12, country13, country14, country15, "Europe");
        Continent Australia = new Continent(country21, country22, country23, country24, country25, "Australia");

        continent.addCountry(country1);
        continent.addCountry(country2);
        continent.addCountry(country3);
        continent.addCountry(country4);
        continent.addCountry(country5);
        continent.addCountry(country11);
        continent.addCountry(country12);
        continent.addCountry(country13);
        continent.addCountry(country14);
        continent.addCountry(country15);
        continent.addCountry(country21);
        continent.addCountry(country22);
        continent.addCountry(country23);
        continent.addCountry(country24);
        continent.addCountry(country25);

        world.addContinent(Asia);
        world.addContinent(Europe);
        world.addContinent(Australia);

        Assert.assertEquals(30000, world.getPeopleQuantity());

    }
}
