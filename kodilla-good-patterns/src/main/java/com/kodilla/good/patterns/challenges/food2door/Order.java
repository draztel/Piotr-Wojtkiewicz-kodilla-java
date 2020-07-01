package com.kodilla.good.patterns.challenges.food2door;

public class Order {

    Provider provider;
    Product product;
    int quantity;

    public Order(Provider provider, Product product, int quantity) {
        this.provider = provider;
        this.product = product;
        this.quantity = quantity;
    }

    public Provider getProvider() {
        return provider;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "provider=" + provider +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
