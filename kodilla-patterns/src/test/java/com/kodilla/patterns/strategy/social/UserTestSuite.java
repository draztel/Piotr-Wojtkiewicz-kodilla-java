package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        User john = new Millenials("john1726");
        User steven = new YGeneration("stevenss");
        User piter = new ZGeneration("piterparker");

        String johnDefaultSocialPublisher = john.sharePost();
        System.out.println(johnDefaultSocialPublisher);
        String stevenDefaultSocialPublisher = steven.sharePost();
        System.out.println(stevenDefaultSocialPublisher);
        String piterDefaultSocialPublisher = piter.sharePost();
        System.out.println(piterDefaultSocialPublisher);

        Assert.assertEquals("Facebook", johnDefaultSocialPublisher);
        Assert.assertEquals("Twitter", stevenDefaultSocialPublisher);
        Assert.assertEquals("Snapchat", piterDefaultSocialPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        User piter = new Millenials("piterparker");

        String piterSocialPublisher = piter.sharePost();
        System.out.println(piterSocialPublisher);
        piter.setSocialPublisher(new SnapchatPublisher());
        piterSocialPublisher = piter.sharePost();
        System.out.println(piterSocialPublisher);

        Assert.assertEquals("Snapchat", piterSocialPublisher);
    }
}
