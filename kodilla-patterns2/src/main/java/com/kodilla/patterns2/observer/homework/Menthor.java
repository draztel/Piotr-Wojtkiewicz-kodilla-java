package com.kodilla.patterns2.observer.homework;

public class Menthor implements Observer {
    private final String username;
    private int updateCount;

    public Menthor(String username) {
        this.username = username;
    }

    @Override
    public void update(TasksQueue tasksQueue) {
        System.out.println(username + ": New tasks" + "\n" +
                "total: " + tasksQueue.getTasks().size());
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
