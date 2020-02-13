package ru.test;

public class Rules {
    public Rules() {
    }

    public CompareResult compare(Result player1Result, Result player2Result) {
        boolean player1BeatsPlayerTwo = player1Result.isBeats(player2Result);
        if (player1BeatsPlayerTwo) return CompareResult.PLAYER1;
        boolean player2BeatsPlayerOne = player2Result.isBeats(player1Result);
        if (player2BeatsPlayerOne) return CompareResult.PLAYER2;
        return CompareResult.TIE;
    }
}
