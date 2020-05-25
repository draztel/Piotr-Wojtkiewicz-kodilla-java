package com.kodilla.exception.test;

public class FlightApplicationRun {
    public static void main(String args[]) {
        FlightApplication flightApplication = new FlightApplication();

        try {
            flightApplication.findFlight(flightApplication.flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("This Flight doesn't exist");
        } finally {
            System.out.println("Please try again!");
        }
    }
}
