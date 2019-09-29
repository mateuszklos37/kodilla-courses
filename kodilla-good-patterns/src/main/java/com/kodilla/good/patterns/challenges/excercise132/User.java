package com.kodilla.good.patterns.challenges.excercise132;

public class User {
    private String name;
    private String surname;
    private String nick;
    private String userID;

    public User(String name, String surname, String nick, String userID) {
        this.name = name;
        this.surname = surname;
        this.nick = nick;
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNick() {
        return nick;
    }

    public String getUserID() {
        return userID;
    }
}
