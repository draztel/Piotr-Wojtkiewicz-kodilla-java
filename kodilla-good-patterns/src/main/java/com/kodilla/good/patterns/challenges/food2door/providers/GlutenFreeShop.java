package com.kodilla.good.patterns.challenges.food2door.providers;

import com.kodilla.good.patterns.challenges.food2door.*;

import java.util.ArrayList;

public class GlutenFreeShop implements Provider {

    String providerName;

    OrderProcessor orderProcessor = new OrderProcessor(new InformationServiceByMail(), new OrderServiceApp(), new OrderRepositoryApp());

    public GlutenFreeShop(final String providerName) {
        this.providerName = providerName;
    }

    @Override
    public ArrayList<Product> productList() {
        ArrayList products = new ArrayList();
        products.add(new Product("Bread", "Gluten free bread", 9));
        products.add(new Product("Dairy", "Gluten free milk", 7));
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
