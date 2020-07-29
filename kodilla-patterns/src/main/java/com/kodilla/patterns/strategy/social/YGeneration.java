package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;

public class YGeneration extends User {
    public YGeneration(String nickname) {
        super(nickname);
        this.socialPublisher = new TwitterPublisher();
    }
}
