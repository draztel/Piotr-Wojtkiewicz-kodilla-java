package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.informationService = informationService;
    }

    public OrderDto process(final Order order) {
        boolean isBought = orderService.createOrder(order);
        if(isBought) {
            informationService.inform(order);
            orderRepository.addToRepository(order);
            return new OrderDto(order, true);
        } else {
            return new OrderDto(order, false);
        }
    }
}
