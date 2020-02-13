package ru.test;

import org.junit.jupiter.api.Test;
import ru.test.players.PaperShowingPlayer;
import ru.test.players.RandomPlayer;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void shouldShowPaperResult() {
        Player p = new PaperShowingPlayer();
        Result result = p.getResult();
        assertNotNull(result);
        assertEquals(Result.PAPER, result);
    }

    @Test
    public void shouldShowRandomResult() {
        Player p = new RandomPlayer();
        Result result = p.getResult();
        assertNotNull(result);
    }

    @Test
    public void shouldCheckPlayerName() {
        Player p = new RandomPlayer();
        assertEquals("Player", p.getName());
    }

    @Test
    public void shouldCheckPlayer2Name() {
        Player p = new RandomPlayer("Player2");
        assertEquals("Player2", p.getName());
    }
}
