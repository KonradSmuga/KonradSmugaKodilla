package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDate;
import java.util.Date;

public class OrderSample {

    public OrderRequest retriver () {

        User user = new User("Konrad", "Smuga", "smuggk@test.pl",new Date(19-11-1990), "smuggk");
        Item item = new Item("gforce 1060", 1400.0);

        LocalDate timeOfOrder = LocalDate.of(2018,5,15);

        return new OrderRequest(user, item, timeOfOrder);
    }
}
