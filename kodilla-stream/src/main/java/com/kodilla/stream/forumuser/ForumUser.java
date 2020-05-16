package com.kodilla.stream.forumuser;

import java.time.*;
import java.util.*;

public class ForumUser {
    private final int userID;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsQuantity;

    public ForumUser(int userID, String username, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int postsQuantity) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsQuantity = postsQuantity;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return birthDate;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return userID == forumUser.userID &&
                sex == forumUser.sex &&
                postsQuantity == forumUser.postsQuantity &&
                Objects.equals(username, forumUser.username) &&
                Objects.equals(birthDate, forumUser.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, username, sex, birthDate, postsQuantity);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsQuantity=" + postsQuantity +
                '}';
    }
}
