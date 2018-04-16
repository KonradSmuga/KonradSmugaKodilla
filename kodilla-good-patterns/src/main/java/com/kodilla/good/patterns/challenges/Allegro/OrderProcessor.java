package com.kodilla.good.patterns.challenges.Allegro;

import com.kodilla.good.patterns.challenges.RentRequest;

public class OrderProcessor {
    private InformationService informationService;
    private RentalService rentalService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final RentalService rentalService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.orderRepository = orderRepository;
    }
/*
    public OrderDto process(final RentRequest rentRequest) {
        boolean isRented = rentalService.createRental(rentRequest.getUser(), rentRequest.getFrom(),
                rentRequest.getTo());
        if(isRented) {
            informationService.inform(rentRequest.getUser());
            orderRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
            return new OrderDto(rentRequest.getUser(), true);
        } else {
            return new OrderDto(rentRequest.getUser(), false);
        }
    }
    */
}
