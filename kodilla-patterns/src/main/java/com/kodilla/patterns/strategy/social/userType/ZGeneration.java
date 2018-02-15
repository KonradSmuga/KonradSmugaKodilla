package com.kodilla.patterns.strategy.social.userType;

import com.kodilla.patterns.strategy.social.User;
import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;

public class ZGeneration extends User {

    public ZGeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
