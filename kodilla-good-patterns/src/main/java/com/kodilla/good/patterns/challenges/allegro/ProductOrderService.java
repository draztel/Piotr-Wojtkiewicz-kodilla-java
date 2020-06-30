package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class ProductOrderService {

    public static void main(String[]args) {

        User testUser = new User("John", "Alibaba", "alibaba@wp.pl");
        Product testProduct = new Product("Elektronika", "Superwydajna elektryczna pompka", 209.99);
        LocalDateTime testTime = LocalDateTime.now();

        OrderProcessor orderProcessor = new OrderProcessor(new InformationServiceByMail(), new OrderServiceApp(), new OrderRepositoryApp());

        orderProcessor.process(testUser, testProduct, testTime);
    }

}
