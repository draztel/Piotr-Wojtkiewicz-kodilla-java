package com.kodilla.patterns.factory.tasks;

public interface Task {
    public boolean executeTask();
    public String getTaskName();
    public boolean isTaskExecuted();
}
