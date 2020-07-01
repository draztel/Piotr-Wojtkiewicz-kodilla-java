package com.kodilla.good.patterns.challenges.food2door;

public class OrderServiceApp implements OrderService {

    @Override
    public boolean createOrder(Order order) {
        System.out.println("Order has been created!");
        return true;
    }
}
