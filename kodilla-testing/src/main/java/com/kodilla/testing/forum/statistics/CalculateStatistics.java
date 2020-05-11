package com.kodilla.testing.forum.statistics;

import java.util.*;

public class CalculateStatistics {
    public int usersQuantity;
    public int postsQuantity;
    public int commentsQuantity;
    public double averagePostsPerUser;
    public double averageCommentsPerUser;
    public double averageCommentsPerPost;

    public CalculateStatistics(int usersQuantity, int postsQuantity, int commentsQuantity, double averagePostsPerUser, double averageCommentsPerUser, double averageCommentsPerPost) {
        this.usersQuantity = usersQuantity;
        this.postsQuantity = postsQuantity;
        this.commentsQuantity = commentsQuantity;
        this.averagePostsPerUser = averagePostsPerUser;
        this.averageCommentsPerUser = averageCommentsPerUser;
        this.averageCommentsPerPost = averageCommentsPerPost;
    }

    public CalculateStatistics() {

    }

    public void calculateAdvStatistics(Statistics statistics) {

        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();

        if(statistics.postsCount() !=0 && statistics.usersNames().size() !=0) {
            averagePostsPerUser = statistics.postsCount() / statistics.usersNames().size();
        } else {
            averagePostsPerUser = 0;
        } if(statistics.commentsCount() !=0 && statistics.usersNames().size() !=0) {
            averageCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        } else {
            averageCommentsPerUser = 0;
        } if (statistics.commentsCount() !=0 && statistics.postsCount() !=0) {
            averageCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
        } else {
            averageCommentsPerPost = 0;
        }
    }

    public void showStatistics() {
        System.out.println(usersQuantity);
        System.out.println(postsQuantity);
        System.out.println(commentsQuantity);
        System.out.println(averagePostsPerUser);
        System.out.println(averageCommentsPerPost);
        System.out.println(averageCommentsPerUser);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculateStatistics that = (CalculateStatistics) o;
        return usersQuantity == that.usersQuantity &&
                postsQuantity == that.postsQuantity &&
                commentsQuantity == that.commentsQuantity &&
                Double.compare(that.averagePostsPerUser, averagePostsPerUser) == 0 &&
                Double.compare(that.averageCommentsPerUser, averageCommentsPerUser) == 0 &&
                Double.compare(that.averageCommentsPerPost, averageCommentsPerPost) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(usersQuantity, postsQuantity, commentsQuantity, averagePostsPerUser, averageCommentsPerUser, averageCommentsPerPost);
    }
}
