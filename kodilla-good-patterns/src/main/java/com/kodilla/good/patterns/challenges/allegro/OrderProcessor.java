package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final User user, Product product, LocalDateTime dateOfOrder) {
        boolean isBought = orderService.createOrder(user, product, dateOfOrder);
        if(isBought) {
            informationService.informUser(user);
            orderRepository.addToRepository(user, product, dateOfOrder);
            return new OrderDto(user, product, true);
        } else {
            return new OrderDto(user, product, false);
        }
    }
}
