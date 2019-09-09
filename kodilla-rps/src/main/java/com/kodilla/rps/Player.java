package com.kodilla.rps;

public class Player {
    private String name;
    private int numberOfWonGames = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfWonGames() {
        return numberOfWonGames;
    }

    public void setNumberOfWonGames() {
        this.numberOfWonGames ++;
    }
}
