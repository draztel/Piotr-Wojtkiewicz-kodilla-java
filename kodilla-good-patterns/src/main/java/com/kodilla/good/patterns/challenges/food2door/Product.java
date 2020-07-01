package com.kodilla.good.patterns.challenges.food2door;

public class Product {
    final String productType;
    final String productName;
    final double productPrice;

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
        return "Product{" +
                "productType='" + productType + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
