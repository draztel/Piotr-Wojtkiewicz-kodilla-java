package com.kodilla.good.patterns.challenges.allegro;

public class Product {
    String productType;
    String productName;
    double productPrice;

    public Product(String productType, String productName, double productPrice) {
        this.productType = productType;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
