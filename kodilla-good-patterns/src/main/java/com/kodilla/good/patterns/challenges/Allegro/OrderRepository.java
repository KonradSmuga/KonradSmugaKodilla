package com.kodilla.good.patterns.challenges.Allegro;

import com.kodilla.good.patterns.challenges.User;

import java.time.LocalDateTime;

public interface OrderRepository {

    boolean createRental(User user, LocalDateTime from, LocalDateTime to);
}