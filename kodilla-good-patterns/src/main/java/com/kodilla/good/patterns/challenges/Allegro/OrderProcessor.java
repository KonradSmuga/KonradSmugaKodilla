package com.kodilla.good.patterns.challenges.Allegro;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getTimeOfOrder());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getTimeOfOrder());
            return new OrderDto(orderRequest.getUser(), orderRequest.getItem(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getItem(), false);
        }
    }
}