package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDate;


public class OrderRequest {
    public User user;
    public Item item;

    public LocalDate timeOfOrder;

    public OrderRequest(User user, Item item, LocalDate timeOfOrder) {
        this.user = user;
        this.item = item;
        this.timeOfOrder = timeOfOrder;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public LocalDate getTimeOfOrder() {
        return timeOfOrder;
    }
}
