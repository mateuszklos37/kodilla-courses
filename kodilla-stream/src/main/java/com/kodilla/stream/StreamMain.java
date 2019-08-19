package com.kodilla.stream;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.Map;
import com.kodilla.stream.forumUser.*;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        LocalDate dateNow = LocalDate.now();
        Map<Integer, ForumUser> theResultMap = theForum.getList().stream().
                filter(user->user.getSex()=='M').
                filter(user-> (dateNow.getYear() - user.getDateOfBirth().getYear()) >= 21).
                filter(user -> user.getNumberOfPosts()>1).
                collect(Collectors.toMap(ForumUser::getUserID, user->user));

        System.out.println("Number of elements: " + theResultMap.size());
        theResultMap.entrySet().stream().
                map(entry ->entry.getKey() +":"+ entry.getValue()).forEach(System.out::println);
    }
}
