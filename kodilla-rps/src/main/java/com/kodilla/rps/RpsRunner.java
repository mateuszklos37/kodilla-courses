package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main (String args[]){
        System.out.println("Welcome to Rock, Paper, Scissors game! \nPlease insert your name:");
        //Nowy obiekt scanner - w celu wpisania nazwy gracza
        Scanner scanner1 = new Scanner(System.in);
        String userName = scanner1.next();
        //konstruktor - nowy gracz - gracz 1 - imię podane przez użytkownika, gracz 2 - "na sztywno" komputer
        Player player1 = new Player(userName);
        Player player2 = new Player("Computer");
        System.out.println("Welcome, " + userName);
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
        while (player1.getNumberOfWonGames() < numberOfGamesToWin && player2.getNumberOfWonGames() < numberOfGamesToWin) {
            System.out.println("Please, insert your turn and accept by Enter: ");
            Scanner userTurnScanner = new Scanner(System.in);
            int userTurn = userTurnScanner.nextInt();
            System.out.println("Your turn: " + userTurn);
            Random computerTurnGenerator = new Random();
            int computerTurn = computerTurnGenerator.nextInt(1) + 2;
            System.out.println("Computer turn: " + computerTurn);
            if (userTurn == 1 && computerTurn == 2) {
                System.out.println(player2.getName() + " wins!");
                player2.setNumberOfWonGames();
            } else if (userTurn == 1 && computerTurn == 3) {
                System.out.println(player1.getName() + " wins!");
                player1.setNumberOfWonGames();
            } else if (userTurn == 2 && computerTurn == 1) {
                System.out.println(player1.getName() + " wins!");
                player1.setNumberOfWonGames();
            } else if (userTurn == 2 && computerTurn == 3) {
                System.out.println(player2.getName() + " wins!");
                player2.setNumberOfWonGames();
            } else if (userTurn == 3 && computerTurn == 1) {
                System.out.println(player2.getName() + " wins!");
                player2.setNumberOfWonGames();
            } else if (userTurn == 3 && computerTurn == 2) {
                System.out.println(player1.getName() + " wins!");
                player1.setNumberOfWonGames();
            } else {
                System.out.println("Draw between players");
            }
            System.out.println("Result after current round: ");
            System.out.println(player1.getName() + " has " + player1.getNumberOfWonGames() + " points");
            System.out.println(player2.getName() + " has " + player2.getNumberOfWonGames() + " points");
        }
    }
}
