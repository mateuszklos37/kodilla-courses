package com.kodilla.testing.forum.statistics;
import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.ForumStatisticsCalculations;
import org.junit.*;
import java.util.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    //
    @BeforeClass
    public static void beforeTests() {System.out.println("All test are starting now");}
    @AfterClass
    public static void afterTests() {System.out.println("All test are finishing now");}
    // pierwszy test - 0 użytkowników, 0 postów, 0 komentarzy
    @Test
    public void testEmptyForum(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> UsersNames = new ArrayList<String>();
        int receivedPostsNumber = 0;
        int receivedCommentsNumber = 0;
        when(statisticsMock.usersNames()).thenReturn(UsersNames);
        when(statisticsMock.postsCount()).thenReturn(receivedPostsNumber);
        when(statisticsMock.commentsCount()).thenReturn(receivedCommentsNumber);
        ForumStatisticsCalculations calcutations = new ForumStatisticsCalculations();
        //When
        calcutations.calculateAdvStatistics(statisticsMock);
        int usersNumber = calcutations.usersQuantity;
        int postsNumber = calcutations.postsQuantity;
        int commentNumber = calcutations.commentsQuantity;
        //Then
        Assert.assertEquals(0, usersNumber);
        Assert.assertEquals(0, postsNumber);
        Assert.assertEquals(0, commentNumber);
    }
    // pierwszy test - 10 użytkowników, 101 postów, 100 komentarzy
    @Test
    public void testNormalForum(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> UsersNames = new ArrayList<String>();
        for (int i=0; i<10;i++){
            UsersNames.add("Staszek");
        }
        int receivedPostsNumber = 101;
        int receivedCommentsNumber = 100;
        when(statisticsMock.usersNames()).thenReturn(UsersNames);
        when(statisticsMock.postsCount()).thenReturn(receivedPostsNumber);
        when(statisticsMock.commentsCount()).thenReturn(receivedCommentsNumber);
        ForumStatisticsCalculations calcutations = new ForumStatisticsCalculations();
        //When
        calcutations.calculateAdvStatistics(statisticsMock);
        int usersNumber = calcutations.usersQuantity;
        int postsNumber = calcutations.postsQuantity;
        int commentNumber = calcutations.commentsQuantity;
        //Then
        Assert.assertEquals(10, usersNumber);
        Assert.assertEquals(101, postsNumber);
        Assert.assertEquals(100, commentNumber);
    }
    // pierwszy test - 10 użytkowników, 100 postów, 101 komentarzy
    @Test
    public void testThirdForum(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> UsersNames = new ArrayList<String>();
        for (int i=0; i<10;i++){
            UsersNames.add("Staszek");
        }
        int receivedPostsNumber = 100;
        int receivedCommentsNumber = 101;
        when(statisticsMock.usersNames()).thenReturn(UsersNames);
        when(statisticsMock.postsCount()).thenReturn(receivedPostsNumber);
        when(statisticsMock.commentsCount()).thenReturn(receivedCommentsNumber);
        ForumStatisticsCalculations calcutations = new ForumStatisticsCalculations();
        //When
        calcutations.calculateAdvStatistics(statisticsMock);
        int usersNumber = calcutations.usersQuantity;
        int postsNumber = calcutations.postsQuantity;
        int commentNumber = calcutations.commentsQuantity;
        //Then
        Assert.assertEquals(10, usersNumber);
        Assert.assertEquals(100, postsNumber);
        Assert.assertEquals(101, commentNumber);
    }
}
