package com.kodilla.good.patterns.challenges.Allegro;


public class Main {

    public static void main(String[] args) {

        OrderSample orderSample = new OrderSample();
        OrderRequest order = orderSample.retriver();

        OrderProcessor orderProcessor = new OrderProcessor(new EmailUser(), new ProductOrderService(), new ItemRepository());
        orderProcessor.process(order);
    }
}