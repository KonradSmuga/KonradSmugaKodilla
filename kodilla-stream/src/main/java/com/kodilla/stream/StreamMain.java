package com.kodilla.stream;

import com.kodilla.stream.array.ArrayOperations;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain implements ArrayOperations {
    public static void main(String[] args) {

        ForumUser forumUser1 = new ForumUser(1, "Adam", 'M', LocalDate.of(1990, 10, 20),
                621);
        ForumUser forumUser2 = new ForumUser(2, "Dawid", 'M', LocalDate.of(1987, 7, 4),
                15);
        ForumUser forumUser3 = new ForumUser(3, "Monika", 'F', LocalDate.of(1990, 3, 12),
                412);
        ForumUser forumUser4 = new ForumUser(4, "Kasia", 'F', LocalDate.of(1983, 4, 16),
                231);
        ForumUser forumUser5 = new ForumUser(5, "Tadeusz", 'M', LocalDate.of(1999, 11, 19),
                128);
        ForumUser forumUser6 = new ForumUser(6, "Kamil", 'M', LocalDate.of(1973, 6, 4),
                14);
        ForumUser forumUser7 = new ForumUser(7, "Adrian", 'M', LocalDate.of(1982, 9, 23),
                121);
        ForumUser forumUser8 = new ForumUser(8, "Michal", 'M', LocalDate.of(1986, 3, 31),
                1);
        ForumUser forumUser9 = new ForumUser(9, "Ania", 'f', LocalDate.of(1999, 8, 15),
                13);

        List<ForumUser> users = Arrays.asList(forumUser1, forumUser2, forumUser3, forumUser4, forumUser5, forumUser6, forumUser7, forumUser8, forumUser9);

        Forum forum = new Forum(users);

        forum.getUserList().stream()
                .filter(s -> s.getSex() == 'M')
                .filter(s -> s.getBirthDate().getYear() < 1998)
                .filter(s -> s.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, s -> s))
                .entrySet().stream()
                .map(entry -> "ID " + entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}



