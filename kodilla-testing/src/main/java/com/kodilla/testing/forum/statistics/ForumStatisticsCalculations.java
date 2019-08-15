package com.kodilla.testing.forum.statistics;
import java.util.*;

public class ForumStatisticsCalculations {
    int usersQuantity;
    int postsQuantity;
    int commentsQuantity;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPosts;

    public void calculateAdvStatistics(Statistics statistics){
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        if (usersQuantity == 0) {
            averageCommentsPerUser = 0;
            averagePostsPerUser = 0;
        }
        else{
            averagePostsPerUser = postsQuantity/usersQuantity;
            averageCommentsPerUser = commentsQuantity/usersQuantity;
        }
        if (postsQuantity ==0 )
            averageCommentsPerPosts = 0;
        else
        averageCommentsPerPosts = commentsQuantity/postsQuantity;
    }
    public void showStatistics(){
        System.out.println("Forum statistics: ");
        System.out.println("Number of users: " + usersQuantity + "quantity of all posts: " + postsQuantity + "quantity of all posts comments: " + commentsQuantity);
        System.out.println("Average posts per user: " + averagePostsPerUser);
        System.out.println("Average comments per user: " + averageCommentsPerUser);
        System.out.println("Average comments per post: " + averageCommentsPerPosts);
    }
}
