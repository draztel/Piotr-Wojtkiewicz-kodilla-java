package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.List;

public class FlightApplication {
    Boolean available = true;
    Boolean notAvailable = false;
    Flight flight1 = new Flight("Poznan", "Gizycko");
    Flight flight2 = new Flight("Warszawa", "Petersburg");
    Flight flight3 = new Flight("Warszawa", "Amsterdam");

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<String, Boolean>();
        flights.put(flight1.getArrivalAirport(), notAvailable);
        flights.put(flight2.getArrivalAirport(), available);
        flights.put(flight3.getArrivalAirport(), notAvailable);

        for (HashMap.Entry entry : flights.entrySet()) {
            if (entry.getKey() == flight.getArrivalAirport()) {
                System.out.println(flights);
            } else {
                throw new RouteNotFoundException();
            }
        }
    }
}


