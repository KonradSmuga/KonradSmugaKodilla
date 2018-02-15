package com.kodilla.patterns.strategy.social.userType;

import com.kodilla.patterns.strategy.social.User;
import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;

public class YGeneration extends User {

    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
