package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class OrderServiceApp implements OrderService {
    @Override
    public boolean createOrder(User user, Product product, LocalDateTime time) {
        System.out.println("Order has been created");
        return true;
    }
}
