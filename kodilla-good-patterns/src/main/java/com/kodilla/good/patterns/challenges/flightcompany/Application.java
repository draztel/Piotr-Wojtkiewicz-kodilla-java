package com.kodilla.good.patterns.challenges.flightcompany;

public class Application {

    public static void main(String[] args) {

        Repository repository = new Repository();
        Search search = new Search();

        search.searchTo(repository.flightList, "Warszawa");
        search.searchFrom(repository.flightList, "Krakow");
        search.searchStopAndTo(repository.flightList, "Warszawa", "Bydgoszcz");
    }
}
