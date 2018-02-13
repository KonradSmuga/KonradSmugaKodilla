package com.kodilla.good.patterns.challenges.food2door;
import java.time.LocalDateTime;

public class OrderProcessor {
    private ProviderInformation providerInformation;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final ProviderInformation providerInformation, final OrderService orderService, final OrderRepository orderRepository) {
        this.providerInformation = providerInformation;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final Provider provider, final LocalDateTime from, final LocalDateTime to) {
        boolean isOrdered = orderService.createRental(provider, from, to);
        if (isOrdered) {
            orderService.createRental(provider, from, to);
            return new OrderDto(provider, true);
        } else {
            return new OrderDto(provider, false);
        }
    }
}
