package com.kodilla.stream.forumuser;

import java.time.*;
import java.util.LinkedList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new LinkedList<>();

    public Forum() {
        forumUserList.add(new ForumUser(0,"draztel",'M',1998, 01,03,21));
        forumUserList.add(new ForumUser(1,"pinokio",'F',2000,11,20,30));
        forumUserList.add(new ForumUser(2,"lukaszek",'M',1990,05,02,2000));
        forumUserList.add(new ForumUser(3,"magicznykrzysztof",'M',1980, 01,02,0));
        forumUserList.add(new ForumUser(4,"magicznakasia",'F',2001, 01,02,0));
    }

    public List<ForumUser> getForumUserList() {
        return new LinkedList<>(forumUserList);
    }
}
