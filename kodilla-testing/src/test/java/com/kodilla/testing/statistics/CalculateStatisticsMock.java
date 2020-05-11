package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistics.CalculateStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;

import java.util.*;

import static org.mockito.Mockito.*;

public class CalculateStatisticsMock {
    @Test
    public void testWithoutPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        LinkedList<String> testUsers = new LinkedList<String>();
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        CalculateStatistics condition = new CalculateStatistics(0,0,0,0,0,0);

        Assert.assertEquals(condition, calculateStatistics);
    }
    @Test
    public void testWithPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        LinkedList<String> testUsers = new LinkedList<String>();
        for(int i=0; i<5; i++) { testUsers.add("User" + i); }
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1000);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        CalculateStatistics condition = new CalculateStatistics(5,1000,0,200,0,0);

        Assert.assertEquals(condition, calculateStatistics);
    }
    @Test
    public void testWithoutComments() {
        Statistics statisticsMock = mock(Statistics.class);
        LinkedList<String> testUsers = new LinkedList<String>();
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        CalculateStatistics condition = new CalculateStatistics(0, 0, 0, 0, 0, 0);

        Assert.assertEquals(condition, calculateStatistics);
    }
    @Test
    public void testMorePostsThanComments() {
        Statistics statisticsMock = mock(Statistics.class);
        LinkedList<String> testUsers = new LinkedList<String>();
        for(int i=0; i<5; i++) { testUsers.add("User" + i); }
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.postsCount()).thenReturn(1000);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        CalculateStatistics condition = new CalculateStatistics(5,1000,500,200,100,0.5);

        Assert.assertEquals(condition, calculateStatistics);
    }
}



