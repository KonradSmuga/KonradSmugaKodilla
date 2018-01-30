package com.kodilla.stream;

import com.kodilla.stream.array.ArrayOperations;
import com.kodilla.stream.array.Asd;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMain implements ArrayOperations {
    public static void main(String[] args) {

        Map<Integer, ForumUser> theResulMapOfUsers = Forum.getUserList().stream()

                .filter(s -> s.getSex() == 'M')
                .filter(s -> s.getBirthDate().getYear() > 1998)
                .filter(s -> s.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getuserId, s->s));

                theResulMapOfUsers.entrySet().stream()
                .map(entry -> "ID "+ entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }




    }



