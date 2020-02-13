package ru.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RulesTest {

    @Test
    public void shouldCompareRockAndPaper() {
        Rules comparer = new Rules();
        CompareResult result = comparer.compare(Result.ROCK, Result.PAPER);
        assertNotNull(result);
        assertEquals(CompareResult.PLAYER2, result);
    }

    @Test
    public void shouldCompareRockAndScissors() {
        Rules comparer = new Rules();
        CompareResult result = comparer.compare(Result.ROCK, Result.SCISSORS);
        assertNotNull(result);
        assertEquals(CompareResult.PLAYER1, result);
    }

    @Test
    public void shouldComparePaperAndScissors() {
        Rules comparer = new Rules();
        CompareResult result = comparer.compare(Result.PAPER, Result.SCISSORS);
        assertNotNull(result);
        assertEquals(CompareResult.PLAYER2, result);
    }

    @Test
    public void shouldComparePaperAndRock() {
        Rules comparer = new Rules();
        CompareResult result = comparer.compare(Result.PAPER, Result.ROCK);
        assertNotNull(result);
        assertEquals(CompareResult.PLAYER1, result);
    }

    @Test
    public void shouldCompareScissorsAndRock() {
        Rules comparer = new Rules();
        CompareResult result = comparer.compare(Result.SCISSORS, Result.ROCK);
        assertNotNull(result);
        assertEquals(CompareResult.PLAYER2, result);
    }

    @Test
    public void shouldCompareScissorsAndPaper() {
        Rules comparer = new Rules();
        CompareResult result = comparer.compare(Result.SCISSORS, Result.PAPER);
        assertNotNull(result);
        assertEquals(CompareResult.PLAYER1, result);
    }

    @Test
    public void shouldCompareRockAndRock() {
        Rules comparer = new Rules();
        CompareResult result = comparer.compare(Result.ROCK, Result.ROCK);
        assertNotNull(result);
        assertEquals(CompareResult.TIE, result);
    }

    @Test
    public void shouldComparePaperAndPaper() {
        Rules comparer = new Rules();
        CompareResult result = comparer.compare(Result.PAPER, Result.PAPER);
        assertNotNull(result);
        assertEquals(CompareResult.TIE, result);
    }

    @Test
    public void shouldCompareScissorsAndScissors() {
        Rules comparer = new Rules();
        CompareResult result = comparer.compare(Result.SCISSORS, Result.SCISSORS);
        assertNotNull(result);
        assertEquals(CompareResult.TIE, result);
    }
}
