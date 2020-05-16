package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class StreamMain {
    public static void main (String[]args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfForumUsers = forum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() < 2000)
                .filter(forumUser -> forumUser.getPostsQuantity() > 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));


        System.out.println(theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry ->entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::print);

    }
}
