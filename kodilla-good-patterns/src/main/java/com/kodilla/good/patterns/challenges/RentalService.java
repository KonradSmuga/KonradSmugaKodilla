package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface RentalService {
    boolean createRental(User user, LocalDateTime from, LocalDateTime to);
}
