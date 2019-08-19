package com.kodilla.stream.forumUser;
import java.util.*;
import java.time.*;

import java.util.*;

public class Forum {
    List <ForumUser> theListOfUsers = new ArrayList<ForumUser>();
    public Forum(){
        theListOfUsers.add(new ForumUser(0001, "Brad Pitt", 'M',LocalDate.of(1963, 12, 18), 21));
        theListOfUsers.add(new ForumUser(0002, "Leonardo DiCaprio", 'M',LocalDate.of(1974, 11, 11), 12));
        theListOfUsers.add(new ForumUser(0003, "Marion Cotillard", 'F',LocalDate.of(1975, 9, 30), 32));
        theListOfUsers.add(new ForumUser(0004, "Robert De Niro", 'M',LocalDate.of(1943, 8, 17), 5));
        theListOfUsers.add(new ForumUser(0005, "Denzel Washington", 'M',LocalDate.of(1954, 12, 28), 9));
        theListOfUsers.add(new ForumUser(0006, "Young Man", 'M',LocalDate.of(2005, 7, 29), 1));
    }

    public List<ForumUser> getList(){
        return theListOfUsers;
    }
}
