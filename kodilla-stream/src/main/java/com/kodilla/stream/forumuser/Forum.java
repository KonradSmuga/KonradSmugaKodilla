package com.kodilla.stream.forumuser;


import java.util.List;

public class Forum {


    private List<ForumUser> users;

    public Forum(List<ForumUser> users) {
        this.users = users;
    }

    public List<ForumUser> getUserList() {

        return users;
    }

}