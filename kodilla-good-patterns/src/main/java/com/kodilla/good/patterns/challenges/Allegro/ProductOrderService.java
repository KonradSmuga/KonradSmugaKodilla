package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDate;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(User user, Item item, LocalDate dateOrder) {
        System.out.println("Product from Allegro: " + item.getName() + " , bought by: " + user.getName() + " " + user.getUsername()
                + " Time of order: " + dateOrder.getYear() + " " + dateOrder.getMonth() +" "+ dateOrder.getDayOfMonth());
        return true;
    }
}
