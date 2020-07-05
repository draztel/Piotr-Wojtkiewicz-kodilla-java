package com.kodilla.good.patterns.challenges.food2door.providers;

import com.kodilla.good.patterns.challenges.food2door.*;

import java.util.ArrayList;

public class HealthyShop implements Provider {

    String providerName;

    OrderProcessor orderProcessor = new OrderProcessor(new InformationServiceByMail(), new OrderServiceApp(), new OrderRepositoryApp());

    public HealthyShop(final String providerName) {
        this.providerName = providerName;
    }

    @Override
    public ArrayList<Product> productList() {
        ArrayList products = new ArrayList();
        products.add(new Product("Fish", "Salmon", 6));
        products.add(new Product("Bread", "Bread", 3));
        return products;
    }

    @Override
    public boolean orderProcess(final Order order) {
        orderProcessor.process(order);
        return true;
    }

    @Override
    public String getProviderName() {
        return providerName;
    }
}
