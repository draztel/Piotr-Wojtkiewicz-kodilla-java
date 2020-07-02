package com.kodilla.good.patterns.challenges.food2door;

public class Order {

    Provider provider;
    Product product;
    int quantity;
    double finalPrice;

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
        return "Provider = " + provider.getProviderName() + "\n" +
                getProduct() + "\n" +
                "Quantity = " + getQuantity() + "\n" +
                "Final price = " + getFinalPrice() + "zl";
    }

    public double getFinalPrice() {
        finalPrice = getQuantity() * getProduct().getProductPrice();
        return finalPrice;
    }
}
