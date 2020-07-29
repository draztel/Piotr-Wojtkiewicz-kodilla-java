package com.kodilla.patterns.factory.tasks;

import java.util.List;

public class DivingTask implements Task {
    String taskName;
    String where;
    String using;
    List executedTasks;

    public DivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public boolean executeTask() {
        System.out.println("Diving task is executed");
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
