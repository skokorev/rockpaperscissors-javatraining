package ru.test;

public class GameResult {
    private int player1WinCount;
    private int player2WinCount;
    private int player3WinCount;
    private int tieCount;

    public GameResult() {
        player1WinCount = 0;
        player2WinCount = 0;
        player3WinCount = 0;
        tieCount = 0;
    }

    public void incrementPlayer1WinCount() {
        player1WinCount++;
    }

    public void incrementPlayer2WinCount() {
        player2WinCount++;
    }

    public void incrementPlayer3WinCount() { player3WinCount++; }

    public void incrementTieCount() {
        tieCount++;
    }

    public int getPlayer1WinCount() {
        return player1WinCount;
    }

    public int getPlayer2WinCount() {
        return player2WinCount;
    }

    public int getPlayer3WinCount() {
        return player3WinCount;
    }

    public int getTieCount() {
        return tieCount;
    }

    public int getTotalCount() {
        return player1WinCount + player2WinCount + player3WinCount + tieCount;
    }
}
