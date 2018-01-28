package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int userId;
    private char sex = 'M'/'F';
    private LocalDate birthDate;
    private int postCount;

    public ForumUser(int userId, char sex, LocalDate birthDate, int postCount) {
        this.userId = userId;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postCount = postCount;
    }

    public int getuserId()
    {
        return this.userId;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return
                "userId=" + userId +
                        ", sex=" + sex +
                        ", birthDate=" + birthDate +
                        ", postCount=" + postCount +
                        '}';
    }

}