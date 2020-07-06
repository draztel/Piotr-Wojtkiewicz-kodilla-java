package com.kodilla.good.patterns.challenges.flightcompany;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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

    public void searchStopAndTo(ArrayList<Flight> flightList, String cityNameFrom, String cityNameTo) {

        Set<Flight> resultListFrom =
                flightList.stream()
                        .filter(flight -> flight.getFrom().equals(cityNameFrom))
                        .collect(Collectors.toSet());

        Set<Flight> resultListTo =
                flightList.stream()
                        .filter(flight -> flight.getTo().equals(cityNameTo))
                        .collect(Collectors.toSet());

        Set<Flight> resultListOfAll =
                flightList.stream()
                        .collect(Collectors.toSet());

        boolean end = false;

        for (Flight flight1 : resultListFrom) {
            for (Flight flight2 : resultListTo) {
                for (Flight flight3 : resultListOfAll) {
                    if (flight1.getTo().equals(flight2.getFrom()) && !end) {
                        System.out.println(flight1);
                        System.out.println(flight2);
                        end = true;
                    } else if (flight1.getTo().equals(flight3.getFrom()) && flight2.getFrom().equals(flight3.getTo()) && !end) {
                        System.out.println(flight1);
                        System.out.println(flight3);
                        System.out.println(flight2);
                        end = true;
                    }
                }
            }
        }
    }
}