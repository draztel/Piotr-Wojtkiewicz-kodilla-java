package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightApplication {
    public static Boolean isAvailable;

    Flight flight1 = new Flight("Poznan", "Gizycko");
    Flight flight2 = new Flight("Warszawa", "Petersburg");
    Flight flight3 = new Flight("Warszawa", "Amsterdam");
    Flight flight4 = new Flight("Warszawa", "HongKong");

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<String, Boolean>();
        flights.put("Gizycko", false);
        flights.put("Petersburg", true);
        flights.put("Amsterdam", false);

        if (flights.containsKey(flight.getArrivalAirport())) {
            System.out.println("Flight" + flights + " Program checked arrival airports availability");
        } else {
            throw new RouteNotFoundException();
        }
    }
}


//        for (HashMap.Entry entry : flights.entrySet()) {
//            if (entry.getKey() == flight.getArrivalAirport() && entry.getValue() == available) {
//                System.out.println(flights);


