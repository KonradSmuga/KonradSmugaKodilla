package com.kodilla.testing.forum.statistics;


import org.junit.*;


import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ForumStatisticTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: begin");
    }

    @After
    public void after() {
        System.out.println("Test case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void whenZeroPostThenAvgIsZero() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        List<String> users = new ArrayList<>();
        users.add("Adam");
        users.add("Ewa");

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);

        //When

        Double averageOfPost = forumStatistics.calculateAverageOfPosts();

        //Then
        Assert.assertEquals(new Double(0), averageOfPost);

    }

    @Test
    public void whenOneThousandPostThenAvgIsFiveHundred() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        List<String> users = new ArrayList<>();
        users.add("Adam");
        users.add("Ewa");

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When

        Double averageOfPost = forumStatistics.calculateAverageOfPosts();

        //Then
        Assert.assertEquals(new Double(500), averageOfPost);

    }

    @Test
    public void whenZeroCommentsThenAvgIsZero() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        List<String> users = new ArrayList<>();
        users.add("Adam");
        users.add("Ewa");

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When

        Double averageOfComents = forumStatistics.calculateAverageOfComents();

        //Then
        Assert.assertEquals(new Double(0), averageOfComents);

    }

    @Test

    public void whenCommentsPostIsHigherThanPost() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        List<String> users = new ArrayList<>();
        users.add("Adam");
        users.add("Ewa");

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(20);
        when(statisticsMock.postsCount()).thenReturn(10);
        //When

        Double commentsHighertThanPost = forumStatistics.calculateAverageOfComentsOverPosts();

        //Then
        Assert.assertEquals(new Double(2), commentsHighertThanPost);

    }

    @Test
    public void whenCommentsPostIsLowerThanPost() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        List<String> users = new ArrayList<>();
        users.add("Adam");
        users.add("Ewa");

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(10);
        //When

        Double commentsLowerThanPost = forumStatistics.calculateAverageOfComentsOverPosts();

        //Then
        Assert.assertEquals(new Double(0.5), commentsLowerThanPost);

    }

    @Test
    public void whenZeroUsersThenAvgIsZero() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        List<String> users = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(users);

        //When

        int quantityOfUsers = forumStatistics.getUsers();

        //Then

        Assert.assertEquals(0, quantityOfUsers);
    }

    @Test
    public void whenOneHundredUsersThenAvgIs() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        List<String> users = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            users.add("Adam");
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(300);
        //When

        Double averageOfPostPerOneHundredUsers = forumStatistics.calculateAverageOfPosts();
        //Then

        Assert.assertEquals(new Double(3), averageOfPostPerOneHundredUsers);
    }


}
