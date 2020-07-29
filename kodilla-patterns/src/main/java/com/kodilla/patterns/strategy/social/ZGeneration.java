package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;

public class ZGeneration extends User {
    public ZGeneration(String nickname) {
        super(nickname);
        this.socialPublisher = new SnapchatPublisher();
    }
}
