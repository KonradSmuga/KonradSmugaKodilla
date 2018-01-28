package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public  class Forum {
    public static List<ForumUser> user = new ArrayList<>();

    public static List<ForumUser> getUserList() {
        user.add(new ForumUser(101, 'F', LocalDate.of(1990, Month.NOVEMBER, 13), 1));
        user.add(new ForumUser(102, 'M', LocalDate.of(1989, Month.JANUARY, 11), 13));
        user.add(new ForumUser(103, 'M', LocalDate.of(1994, Month.MARCH, 21), 8));
        user.add(new ForumUser(103, 'M', LocalDate.of(1999, Month.JULY, 14), 21));
        return user;
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(user);
    }

}