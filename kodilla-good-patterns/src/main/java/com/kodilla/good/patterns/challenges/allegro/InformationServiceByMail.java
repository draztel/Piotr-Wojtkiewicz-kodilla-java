package com.kodilla.good.patterns.challenges.allegro;

public class InformationServiceByMail implements InformationService {
    public void informUser(User user) {
        System.out.println("E-mail about order has been sent to " + user.getName() + " " + user.getSurname());
    }

}
