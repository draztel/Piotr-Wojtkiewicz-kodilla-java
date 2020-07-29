package com.kodilla.patterns.factory.tasks;

import java.util.List;

public class PaintingTask implements Task {
    String taskName;
    String color;
    String whatToPaint;
    List executedTasks;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public boolean executeTask() {
        System.out.println("Painting task is executed");
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
