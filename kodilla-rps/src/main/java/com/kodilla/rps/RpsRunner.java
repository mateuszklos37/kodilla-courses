package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main (String args[]){
        boolean finishGame = false;
        System.out.println("Welcome to Rock, Paper, Scissors game! \nPlease insert your name:");
        //Nowy obiekt scanner - w celu wpisania nazwy gracza
        Scanner scanner1 = new Scanner(System.in);
        String userName = scanner1.next();
        //konstruktor - nowy gracz - gracz 1 - imię podane przez użytkownika, gracz 2 - "na sztywno" komputer
        Player player1 = new Player(userName);
        Player player2 = new Player("Computer");
        System.out.println("Welcome, " + player1.getName());
        System.out.println("Please, insert number of won games by player to total win: ");
        System.out.println("You may choose 1, 3 or 5 games.");
        Scanner scanner2 = new Scanner(System.in);
        int numberOfGamesToWin = scanner2.nextInt();
        System.out.println("You inserted: " + numberOfGamesToWin);
        while (numberOfGamesToWin != 1 && numberOfGamesToWin != 3 && numberOfGamesToWin != 5){
            System.out.println("You choosen wrong number of won games to total win. Correct quantity is: 1, 3 or 5");
            numberOfGamesToWin = scanner1.nextInt();
        }
        //wyświetlenie zasad gry
        System.out.println("Game rules: ");
        System.out.println("1 button: Rock");
        System.out.println("2 button: Paper");
        System.out.println("3 button: Scissors");
        System.out.println("X button: End game");
        System.out.println("N button: Restart game");
        //jedna rozgrywka dla wstępnego sprawdzenia
        while (player1.getNumberOfWonGames() < numberOfGamesToWin && player2.getNumberOfWonGames() < numberOfGamesToWin && finishGame == false) {
            System.out.println("Please, insert your turn and accept by Enter: ");
            Scanner userTurnScanner = new Scanner(System.in);
            String userInput = userTurnScanner.next();
            PlayersTurn playersTurn = PlayersTurn.chooseTurn(userInput);
            Random computerTurnGenerator = new Random();
            int computerTurn = computerTurnGenerator.nextInt(300);
            String computersTurn;
            if (computerTurn<101)
            {
                computersTurn = "Rock";
            }
            else if (computerTurn >200){
                computersTurn = "Scissors";
            }
            else
                computersTurn = "Paper";
            if(playersTurn.getTurn() == "N"){
                player1.eraseNumberOfWon();
                player2.eraseNumberOfWon();
                System.out.println("Game was restarted");
                continue;
            } else if(playersTurn.getTurn() == "X"){
                System.out.println("You decided to finish this game! Thank you!");
                finishGame = true;
                break;
            } else if (playersTurn.getTurn() == "1" && computerTurn > 100 && computerTurn <= 200) {
                System.out.println(player2.getName() + " wins!");
                player2.setNumberOfWonGames();
            } else if (playersTurn.getTurn() == "1" && computerTurn > 200 && computerTurn <=300) {
                System.out.println(player1.getName() + " wins!");
                player1.setNumberOfWonGames();
            } else if (playersTurn.getTurn() =="2" && computerTurn >= 0 && computerTurn <=100) {
                System.out.println(player1.getName() + " wins!");
                player1.setNumberOfWonGames();
            } else if (playersTurn.getTurn() =="2" && computerTurn > 200 && computerTurn <=300) {
                System.out.println(player2.getName() + " wins!");
                player2.setNumberOfWonGames();
            } else if (playersTurn.getTurn() =="3" && computerTurn > 0 && computerTurn <=100) {
                System.out.println(player2.getName() + " wins!");
                player2.setNumberOfWonGames();
            } else if (playersTurn.getTurn() == "3" && computerTurn > 100 && computerTurn <=200) {
                System.out.println(player1.getName() + " wins!");
                player1.setNumberOfWonGames();
            } else if ((playersTurn.getTurn() =="1"&& computerTurn <=100) || (playersTurn.getTurn() == "2" && computerTurn > 100 && computerTurn <=200)|| (playersTurn.getTurn() =="3" && computerTurn >200 && computerTurn<=300)) {
                System.out.println("Draw between players");
            } else{
                System.out.println("Wrong turn - please insert sth from: Rock, Paper, Scissors, New Game, End Game");
                continue;
            }
            System.out.println("Your turn: " + playersTurn);
            System.out.println("Computer turn: " + computersTurn);
            System.out.println("Result after current round: ");
            System.out.println(player1.getName() + " has " + player1.getNumberOfWonGames() + " point(s)");
            System.out.println(player2.getName() + " has " + player2.getNumberOfWonGames() + " point(s)");
        }
        System.out.println("This game finished with result: [" + player1.getName() +"] " + player1.getNumberOfWonGames() + " vs. [Computer] " + player2.getNumberOfWonGames());
    }
}
