package com.kodilla.good.patterns.challenges.flightcompany;

import java.util.Objects;

public class Flight {

    String from;
    String stop;
    String to;

    public Flight(String from, String stop, String to) {
        this.from = from;
        this.stop = stop;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getStop() {
        return stop;
    }

    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from='" + from + '\'' +
                ", stop='" + stop + '\'' +
                ", to='" + to + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return from.equals(flight.from) &&
                stop.equals(flight.stop) &&
                to.equals(flight.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, stop, to);
    }
}
