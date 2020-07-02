package com.kodilla.good.patterns.challenges.food2door;

public class Product {

    final String productType;
    final String productName;
    final double productPrice;
    Order order;

    public Product(final String productType,final String productName,final double productPrice) {
        this.productType = productType;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Product type = " + getProductType() + "\n" +
                "Product name = " + getProductName() + "\n" +
                "Product price = " + getProductPrice() + "zl";
    }
}
