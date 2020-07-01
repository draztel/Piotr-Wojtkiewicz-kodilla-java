package com.kodilla.good.patterns.challenges.food2door;

public class OrderApplication {

    public static void main(String[] args) {

        OrderProcessor orderProcessor = new OrderProcessor(new InformationServiceByMail(), new OrderServiceApp(), new OrderRepositoryApp());

        Provider extraFoodShop = new Provider("ExtraFoodShop", "Sweet food");
        Provider healthyShop = new Provider("HealthyShop", "Healthy food");
        Provider glutenFreeShop = new Provider("GlutenFreeShop", "Gluten free food");

        Product donut = new Product("Sweets", "Donut", 1);
        Product cake = new Product("Sweets", "Cake", 1.5);

        Product salmon = new Product("Fish", "Fresh Salmon", 19);
        Product bread = new Product("Bread", "Bread", 3);

        Product glutenFreeBread = new Product("Bread", "Gluten free bread", 6);
        Product glutenFreeMilk = new Product("Dairy", "Gluten free milk", 5);


        extraFoodShop.productList.add(0, donut);
        extraFoodShop.productList.add(1, cake);

        healthyShop.productList.add(0, salmon);
        healthyShop.productList.add(1, bread);

        glutenFreeShop.productList.add(0, glutenFreeBread);
        glutenFreeShop.productList.add(1, glutenFreeMilk);


        Order order100Donuts = new Order(extraFoodShop, extraFoodShop.productList.get(0), 100);

        orderProcessor.process(order100Donuts);
    }
}
