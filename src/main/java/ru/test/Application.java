package ru.test;

import ru.test.players.PaperShowingPlayer;
import ru.test.players.RandomPlayer;

public class Application {
    public static void main(String[] args) {
        Player player1 = new PaperShowingPlayer();
        Player player2 = new RandomPlayer();
        Rules rules = new Rules();
        GameForTwoPlayersImpl game = new GameForTwoPlayersImpl(100, player1, player2, rules);
        GameResult result = game.run();
        GameResultPrinter printer = new GameResultPrinter();
        printer.print(result);
    }
}
