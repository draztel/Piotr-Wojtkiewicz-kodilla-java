package com.kodilla.exception.test;

public class FlightApplicationRun {
    public static void main(String args[]) {
        FlightApplication flightApplication = new FlightApplication();

        try {
            flightApplication.findFlight(flightApplication.flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Either flight doesn't exist or airport is not available");;
        } finally {
            System.out.println("Please try again!");
        }
    }
}
