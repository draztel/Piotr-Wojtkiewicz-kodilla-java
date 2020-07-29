package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDivingTask() {
        TaskFactory factory = new TaskFactory();

        Task divingTask = factory.makeTask(TaskFactory.DIVINGTASK);

        Assert.assertEquals("diving task", divingTask.getTaskName());
    }

    @Test
    public void testFactoryPaintingTask() {
        TaskFactory factory = new TaskFactory();

        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);

        Assert.assertEquals("painting task", paintingTask.getTaskName());
    }

    @Test
    public void testFactoryShoppingTask() {
        TaskFactory factory = new TaskFactory();

        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);

        Assert.assertEquals("shopping task", shoppingTask.getTaskName());
    }
}
