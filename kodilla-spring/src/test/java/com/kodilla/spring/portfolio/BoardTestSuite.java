package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //when
        board.toDoList.tasks.add("to do task");
        board.inProgressList.tasks.add("in progress task");
        board.doneList.tasks.add("done task");

        String resultToDo = "tasks=" + board.toDoList.tasks.get(0);
        String resultInProgress = "tasks=" + board.inProgressList.tasks.get(0);
        String resultDone = "tasks=" + board.doneList.tasks.get(0);

        //then
        Assert.assertEquals("tasks=to do task", resultToDo);
        Assert.assertEquals("tasks=in progress task", resultInProgress);
        Assert.assertEquals("tasks=done task", resultDone);
    }
}
