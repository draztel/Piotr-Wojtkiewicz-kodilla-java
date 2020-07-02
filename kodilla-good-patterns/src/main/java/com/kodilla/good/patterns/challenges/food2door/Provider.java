package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public interface Provider {

    List<Product> productList();

    boolean orderProcess(Order order);

    String getProviderName();
}
