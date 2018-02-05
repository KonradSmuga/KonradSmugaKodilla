package com.kodilla.good.patterns.challenges;

import java.util.Date;

public class User {
    private final String name;
    private final String username;
    private final String email;
    private final Date dateOfBirth;
    private final String nickName;


    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getNickName() {
        return nickName;
    }

    public User(String name, String username, String email, Date dateOfBirth, String nickName) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.nickName = nickName;

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}