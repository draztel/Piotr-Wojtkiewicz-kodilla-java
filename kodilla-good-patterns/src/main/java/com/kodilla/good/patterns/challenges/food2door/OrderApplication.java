package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.providers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.providers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.providers.HealthyShop;

public class OrderApplication {

    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop");
        HealthyShop healthyShop = new HealthyShop("HealthyShop");
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("GlutenFreeShop");

        Order order100Milk = new Order(glutenFreeShop, glutenFreeShop.productList().get(1), 100);

        glutenFreeShop.orderProcess(order100Milk);
    }
}
