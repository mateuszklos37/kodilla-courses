package com.kodilla.rps;

public enum PlayersTurn {
    Rock("1"), Paper("2"), Scissors("3"), EndGame("X"), NewGame("N"), Error("E");

    private String turn;

    PlayersTurn(String turn) {
        this.turn = turn;
    }

    public String getTurn() {
        return turn;
    }

    @Override
    public String toString() {
        return name();
    }

    public static PlayersTurn chooseTurn(String usersInput){
        if (usersInput.equals("1")){
            return Rock;
        }
        else if(usersInput.equals("2")){
            return Paper;
        }
        else if(usersInput.equals("3")){
            return Scissors;
        }
        else if(usersInput.equals("x")){
            return EndGame;
        }
        else if(usersInput.equals("n")){
            return NewGame;
        }
        else{
            return Error;
        }
    }
}

