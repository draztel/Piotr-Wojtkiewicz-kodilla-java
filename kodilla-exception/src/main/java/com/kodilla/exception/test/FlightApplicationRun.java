package com.kodilla.exception.test;

public class FlightApplicationRun {
    public static void main(String args[]) {
        FlightApplication flightApplication = new FlightApplication();

        try {
            flightApplication.findFlight(flights.get());
        } catch (RouteNotFoundException e) {
            System.out.println("Flight doesn't exist or arrival airport is not available");;
        } finally {
            System.out.println("Please try again!");
        }
    }
}
