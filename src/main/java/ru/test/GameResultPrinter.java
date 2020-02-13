package ru.test;

public class GameResultPrinter {
    public void print(GameResult result) {
        System.out.println("Player 1 wins " + result.getPlayer1WinCount() + " of " + result.getTotalCount() + " games");
        System.out.println("Player 2 wins " + result.getPlayer2WinCount() + " of " + result.getTotalCount() + " games");
        System.out.println("Tie: " + result.getTieCount() + " of " + result.getTotalCount() + " games");
    }
}
