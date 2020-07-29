package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DIVINGTASK = "DIVING TASK";
    public static final String PAINTINGTASK = "PAINTING TASK";
    public static final String SHOPPINGTASK = "SHOPPING TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DIVINGTASK:
                return new DivingTask("diving task", "location", "equipment");
            case PAINTINGTASK:
                return new PaintingTask("painting task", "color", "what to paint");
            case SHOPPINGTASK:
                return new ShoppingTask("shopping task", "product", 10);
            default:
                return null;
        }
    }
}
