package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {

    private Order order;
    private boolean isBought;

    public OrderDto(Order order, boolean isBought) {
        this.isBought = isBought;
    }

    public boolean isBought() {
        return isBought;
    }
}
