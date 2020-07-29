package com.kodilla.patterns.factory.tasks;

import java.util.List;

public class ShoppingTask implements Task {
    String taskName;
    String whatToBuy;
    double quantity;
    List executedTasks;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public boolean executeTask() {
        System.out.println("Shopping task is executed");
        return true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(executeTask() == true) {
            executedTasks.add(getTaskName());
            return true;
        } else {
            return false;
        }
    }
}
