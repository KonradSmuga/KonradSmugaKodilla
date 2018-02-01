package com.kodilla.stream;

import com.kodilla.stream.array.ArrayOperations;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//Sprobowac uzyc  Arrays.asList.
public class StreamMain implements ArrayOperations {
    public static void main(String[] args) {
        ForumUser forumUser = new ForumUser(1, "Adam", 'M', LocalDate.of(1990, 10, 20),
                20);
        ForumUser forumUser1 = new ForumUser(1, "Dawid", 'M', LocalDate.of(1987, 10, 20),
                20);
        ForumUser forumUser2 = new ForumUser(1, "Monika", 'F', LocalDate.of(1990, 10, 20),
                20);
        ForumUser forumUser3 = new ForumUser(1, "Kasia", 'F', LocalDate.of(1990, 10, 20),
                20);
        ForumUser forumUser4 = new ForumUser(1, "Tadeusz", 'M', LocalDate.of(1990, 10, 20),
                20);

        List<ForumUser> users = new ArrayList<>();
        users.add(forumUser);
        users.add(forumUser1);
        users.add(forumUser2);
        users.add(forumUser3);
        users.add(forumUser4);

        Forum forum = new Forum(users);

        forum.getUserList().stream()
                .filter(s -> s.getSex() == 'M')
                .filter(s -> s.getBirthDate().getYear() > 1998)
                .filter(s -> s.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, s -> s))
                .entrySet().stream()
                .map(entry -> "ID " + entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}



