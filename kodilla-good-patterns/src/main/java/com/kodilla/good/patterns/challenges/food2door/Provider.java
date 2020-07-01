package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class Provider {
    String providerName;
    String providerFoodType; //short describe

    ArrayList<Product> productList = new ArrayList<>();

    public Provider(String providerName, String providerFoodType) {
        this.providerName = providerName;
        this.providerFoodType = providerFoodType;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getProviderFoodType() {
        return providerFoodType;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "providerName='" + providerName + '\'' +
                '}';
    }
}
