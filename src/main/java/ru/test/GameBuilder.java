package ru.test;

import java.util.LinkedList;
import java.util.List;

public class GameBuilder {
    private int rounds;
    private List<Player> players;

    public GameBuilder(int rounds) {
        this.rounds = rounds;
        this.players = new LinkedList<>();
    }

    public GameBuilder addPlayer(Player player) {
        if (players.size() == 3)
            throw new IllegalStateException("Insufficient number of players");
        players.add(player);
        return this;
    }

    public Game build() {
        if (players.size() == 2)
            return new GameForTwoPlayersImpl(rounds,
                players.get(0),
                players.get(1),
                new Rules());
        if (players.size() == 3)
            return new GameForThreePlayersImpl(rounds,
                    players.get(0),
                    players.get(1),
                    players.get(2),
                    new Rules());
        throw new IllegalStateException();
    }
}
