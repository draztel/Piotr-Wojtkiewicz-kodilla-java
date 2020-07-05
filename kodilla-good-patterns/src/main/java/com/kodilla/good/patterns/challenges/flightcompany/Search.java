package com.kodilla.good.patterns.challenges.flightcompany;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Search {

    public void searchTo(ArrayList<Flight> flightList, String cityName) {

        flightList.stream()
                .filter(flight -> flight.getTo().equals(cityName))
                .forEach(System.out::println);
    }

    public void searchFrom(ArrayList<Flight> flightList, String cityName) {

        flightList.stream()
                .filter(flight -> flight.getFrom().equals(cityName))
                .forEach(System.out::println);
    }

    public void searchStopAndTo(ArrayList<Flight> flightList,String cityNameStop, String cityNameTo) {

        List<Flight> resultList =
        flightList.stream()
                .filter(flight -> flight.getStop().equals(cityNameStop))
                .filter(flight -> flight.getTo().equals(cityNameTo))
                .collect(Collectors.toList());

        System.out.println(resultList);
    }
}
