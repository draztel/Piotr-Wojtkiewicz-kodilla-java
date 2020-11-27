package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class MenthorTest {
    @Test
    public void testUpdate() {
        //Given
        TasksQueue tasksQueue1 = new TasksQueue();
        TasksQueue tasksQueue2 = new TasksQueue();
        Menthor menthor1 = new Menthor("Adam Kowalski");
        Menthor menthor2 = new Menthor("Walter White");
        Menthor menthor3 = new Menthor("Adam Mickiewicz");
        tasksQueue1.registerObserver(menthor1);
        tasksQueue1.registerObserver(menthor2);
        tasksQueue2.registerObserver(menthor1);
        tasksQueue2.registerObserver(menthor3);
        //When
        tasksQueue1.addTask("queue1 task1");
        tasksQueue1.addTask("queue1 task2");
        tasksQueue1.addTask("queue1 task3");
        tasksQueue2.addTask("queue2 task1");
        tasksQueue2.addTask("queue2 task2");
        //Then
        Assert.assertEquals(5, menthor1.getUpdateCount());
        Assert.assertEquals(3, menthor2.getUpdateCount());
        Assert.assertEquals(2, menthor3.getUpdateCount());
    }
}
