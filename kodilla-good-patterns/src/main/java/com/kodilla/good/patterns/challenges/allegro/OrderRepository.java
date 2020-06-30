package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean addToRepository (User user, Product product, LocalDateTime dateOfOrder);
}
