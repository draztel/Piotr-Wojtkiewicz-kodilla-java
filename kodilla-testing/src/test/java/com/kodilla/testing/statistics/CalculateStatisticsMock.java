package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistics.CalculateStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;

import java.util.*;

import static org.mockito.Mockito.*;

public class CalculateStatisticsMock {

    private static int testCounter = 0;
    @Before
    public void beforeEveryTest() {
        System.out.println("Executing test #" + testCounter);
        testCounter++;
    }

    @Test
    public void testWithoutPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUsers = new LinkedList<String>();
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(statisticsMock);
        CalculateStatistics condition = new CalculateStatistics(0, 0, 0, 0, 0, 0);

        Assert.assertEquals(condition, calculateStatistics);
    }
    @Test
    public void testWithPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUsers = new LinkedList<String>();
        for(int i=0; i<5; i++) { testUsers.add("testuser" + i); }
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(statisticsMock);
        CalculateStatistics condition = new CalculateStatistics(5, 1000, 0, 200, 0, 0);

        Assert.assertEquals(condition, calculateStatistics);
    }
    @Test
    public void testWithoutComments() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUsers = new LinkedList<String>();
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(statisticsMock);
        CalculateStatistics condition = new CalculateStatistics(0, 0, 0, 0, 0, 0);

        Assert.assertEquals(condition, calculateStatistics);
    }
    @Test
    public void testMorePostsThanComments() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUsers = new LinkedList<String>();
        for(int i=0; i<5; i++) { testUsers.add("testuser" + i); }
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(statisticsMock);
        CalculateStatistics condition = new CalculateStatistics(5, 1000, 500, 200, 100, 0.5);


        Assert.assertEquals(condition, calculateStatistics);
    }
    @Test
    public void testMoreCommentsThanPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUsers = new LinkedList<String>();
        for(int i=0; i<5; i++) { testUsers.add("testuser" + i); }
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(statisticsMock);
        CalculateStatistics condition = new CalculateStatistics(5, 500, 1000, 100, 200, 2);


        Assert.assertEquals(condition, calculateStatistics);
    }
    @Test
    public void testWithoutUsers() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUsers = new LinkedList<String>();
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(statisticsMock);
        CalculateStatistics condition = new CalculateStatistics(0, 0, 0, 0, 0, 0);


        Assert.assertEquals(condition, calculateStatistics);
    }
    @Test
    public void testWithUsers() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUsers = new LinkedList<String>();
        for(int i=0; i<100; i++) { testUsers.add("testuser" + i); }
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        calculateStatistics.calculateAdvStatistics(statisticsMock);
        CalculateStatistics condition = new CalculateStatistics(100, 0, 0, 0, 0, 0);


        Assert.assertEquals(condition, calculateStatistics);
    }
}