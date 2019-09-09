package com.kodilla.rps;

public enum NumberOfGames {
    One(1), Three(3), Five(5);

    private int number;

    NumberOfGames(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
