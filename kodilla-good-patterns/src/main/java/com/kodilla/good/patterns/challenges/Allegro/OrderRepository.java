package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDate;

public interface OrderRepository {
    void createOrder(User user, Item item, LocalDate timeOfOrder);
}
