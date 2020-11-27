package com.kodilla.patterns2.observer.forum;


import org.junit.Assert;
import org.junit.Test;

public class ForumUserTest {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic topic1 = new JavaHelpForumTopic();
        ForumTopic topic2 = new JavaHelpForumTopic();
        ForumUser user1 = new ForumUser("John Smith");
        ForumUser user2 = new ForumUser("Ivone Escobar");
        ForumUser user3 = new ForumUser("Walter White");
        topic1.registerObserver(user1);
        topic1.registerObserver(user3);
        topic2.registerObserver(user2);
        topic2.registerObserver(user3);
        //When
        topic1.addPost("Hi everyone!");
        topic1.addPost("Can you help me ?");
        topic2.addPost("my MYSQL database doesn't work :(");
        topic1.addPost("Yes we can");
        topic2.addPost("This is my error: blah blah");
        //Then
        Assert.assertEquals(3, user1.getUpdateCount());
        Assert.assertEquals(2, user2.getUpdateCount());
        Assert.assertEquals(5, user3.getUpdateCount());
    }
}
