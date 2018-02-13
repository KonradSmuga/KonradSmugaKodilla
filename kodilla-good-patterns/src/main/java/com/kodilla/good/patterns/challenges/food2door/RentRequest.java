package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class RentRequest {

    public Provider provider;
    public LocalDateTime from;
    public LocalDateTime to;

    public RentRequest(Provider provider, LocalDateTime from, LocalDateTime to) {
        this.provider = provider;
        this.from = from;
        this.to = to;
    }

    public Provider getProvider() {
        return provider;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }
}
