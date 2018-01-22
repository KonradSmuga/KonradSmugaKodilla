package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private Statistics statistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUsers() {
        return statistics.usersNames().size();
    }

    public int getPosts() {
        return statistics.postsCount();
    }

    public double calculateAverageOfPosts() {

        return statistics.postsCount() / statistics.usersNames().size();

    }

    public double calculateAverageOfComents() {


        return statistics.commentsCount() / statistics.usersNames().size();
    }

    public double calculateAverageOfComentsOverPosts() {


        return (double)statistics.commentsCount() / (double)statistics.postsCount();

    }

}
