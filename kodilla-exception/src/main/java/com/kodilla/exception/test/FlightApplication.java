package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightApplication {
    Boolean isAvailable;

    Flight flight1 = new Flight("Poznan", "Gizycko");
    Flight flight2 = new Flight("Warszawa", "Petersburg");
    Flight flight3 = new Flight("Warszawa", "Amsterdam");

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<String, Boolean>();
        flights.put("Gizycko", isAvailable = false);
        flights.put("Petersburg", isAvailable = true);
        flights.put("Amsterdam", isAvailable = false);

        for (HashMap.Entry entry : flights.entrySet()) {
            if (entry.getKey() == flight.getArrivalAirport()) {
                System.out.println("Flight" + flight + " is" + isAvailable);
            } else {
                throw new RouteNotFoundException();
            }
        }
    }
}

//        for (HashMap.Entry entry : flights.entrySet()) {
//            if (entry.getKey() == flight.getArrivalAirport() && entry.getValue() == available) {
//                System.out.println(flights);


