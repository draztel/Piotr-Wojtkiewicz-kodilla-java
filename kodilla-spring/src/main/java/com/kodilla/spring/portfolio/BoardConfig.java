package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("theToDoList")
    TaskList theToDoList;

    @Autowired
    @Qualifier("theInProgressList")
    TaskList theInProgressList;

    @Autowired
    @Qualifier("theDoneList")
    TaskList theDoneList;


    @Bean
    public Board getBoard() {
        return new Board(theToDoList, theInProgressList, theDoneList);
    }

    @Bean(name = "theToDoList")
    @Scope("prototype")
    public TaskList getTheToDoList() {
        return new TaskList();
    }

    @Bean(name = "theInProgressList")
    @Scope("prototype")
    public TaskList getTheInProgressList() {
        return new TaskList();
    }

    @Bean(name = "theDoneList")
    @Scope("prototype")
    public TaskList getTheDoneList() {
        return new TaskList();
    }
}
