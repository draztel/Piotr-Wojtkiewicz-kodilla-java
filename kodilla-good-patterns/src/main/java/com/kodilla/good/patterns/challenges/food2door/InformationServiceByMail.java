package com.kodilla.good.patterns.challenges.food2door;

public class InformationServiceByMail implements InformationService {

    @Override
    public void inform(Order order) {
        System.out.println("Informations about your order are below: \n" + order);
    }
}
