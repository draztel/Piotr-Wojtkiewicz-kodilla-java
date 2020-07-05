package com.kodilla.good.patterns.challenges.food2door.providers;

import com.kodilla.good.patterns.challenges.food2door.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExtraFoodShop implements Provider {

    String providerName;

    OrderProcessor orderProcessor = new OrderProcessor(new InformationServiceByMail(), new OrderServiceApp(), new OrderRepositoryApp());

    public ExtraFoodShop(final String providerName) {
        this.providerName = providerName;
    }

    @Override
    public ArrayList<Product> productList() {
        ArrayList products = new ArrayList();
        products.add(new Product("Sweets", "Donut", 1));
        products.add(new Product("Sweets", "Cake", 2));
        return products;
    }

    @Override
    public boolean orderProcess(final Order order) {
        orderProcessor.process(order);
        return true;
    }

    public String getProviderName() {
        return providerName;
    }
}
