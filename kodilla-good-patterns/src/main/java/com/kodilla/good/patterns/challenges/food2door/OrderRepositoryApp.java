package com.kodilla.good.patterns.challenges.food2door;


public class OrderRepositoryApp implements OrderRepository {

    @Override
    public boolean addToRepository(Order order) {
        System.out.println("Order has been added to repository!");
        return true;
    }
}
