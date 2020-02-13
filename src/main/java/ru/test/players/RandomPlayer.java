package ru.test.players;

import ru.test.Player;
import ru.test.Result;

import java.util.Random;

public class RandomPlayer extends Player {
    private final Random random = new Random();

    public RandomPlayer(String name) {
        super(name);
    }

    public RandomPlayer() {
        super();
    }

    public Result getResult() {
        switch (getRandomNumberOfOneTwoThree()) {
            case 1: return Result.ROCK;
            case 2: return Result.PAPER;
            case 3: return Result.SCISSORS;
            default: return Result.ROCK;
        }
    }

    private int getRandomNumberOfOneTwoThree() {
        return random.nextInt(3) + 1;
    }
}
