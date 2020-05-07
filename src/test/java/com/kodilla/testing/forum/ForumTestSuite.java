package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.Assert;
import org.junit.Test;

public class ForumTestSuite {
    @Test
    public void testCaseUsername() {

        SimpleUser simpleuser = new SimpleUser("theForumUser");

        String result = simpleuser.getUsername();

        Assert.assertEquals("theForumUser", result);
    }
}
