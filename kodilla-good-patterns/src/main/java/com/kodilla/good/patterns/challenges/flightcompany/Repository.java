package com.kodilla.good.patterns.challenges.flightcompany;

import java.util.ArrayList;

public class Repository {

    City warszawa = new City("Warszawa");
    City bydgoszcz = new City("Bydgoszcz");
    City zielonaGora = new City("Zielona Gora");
    City poznan = new City("Poznan");
    City krakow = new City("Krakow");

    ArrayList<Flight> flightList = new ArrayList<>();

    public Repository() {
        flightList.add(new Flight(warszawa.getCityName(), zielonaGora.getCityName()));
        flightList.add(new Flight(zielonaGora.getCityName(), krakow.getCityName()));
        flightList.add(new Flight(krakow.getCityName(), bydgoszcz.getCityName()));
        flightList.add(new Flight(poznan.getCityName(), warszawa.getCityName()));
        flightList.add(new Flight(warszawa.getCityName(), poznan.getCityName()));
    }
}
