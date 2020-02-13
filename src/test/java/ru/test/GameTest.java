package ru.test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.test.players.PaperShowingPlayer;
import ru.test.players.RandomPlayer;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GameTest {

    @Test
    public void shouldRunGame() {
        Player p1 = new PaperShowingPlayer();
        Player p2 = new RandomPlayer();
        Game game = new GameBuilder(10).
                addPlayer(p1).
                addPlayer(p2).
                build();
        GameResult result = game.run();
        assertNotNull(result);
    }

}
