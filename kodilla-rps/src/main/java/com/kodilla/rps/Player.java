package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

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

    public int eraseNumberOfWon(){ return numberOfWonGames = 0;}

    }
