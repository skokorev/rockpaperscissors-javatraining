package ru.test;

public class GameForTwoPlayersImpl implements Game {
    private int rounds;
    private Player player1;
    private Player player2;
    private Rules rules;

    public GameForTwoPlayersImpl(int rounds, Player player1, Player player2, Rules rules) {
        this.rounds = rounds;
        this.player1 = player1;
        this.player2 = player2;
        this.rules = rules;
    }

    @Override
    public GameResult run() {
        GameResult result = new GameResult();
        for (int i = 0; i < rounds; i++)
            switch (rules.compare(player1.getResult(), player2.getResult())) {
                case PLAYER1:
                    result.incrementPlayer1WinCount();
                    break;
                case PLAYER2:
                    result.incrementPlayer2WinCount();
                    break;
                case TIE:
                    result.incrementTieCount();
            }
        return result;
    }
}
