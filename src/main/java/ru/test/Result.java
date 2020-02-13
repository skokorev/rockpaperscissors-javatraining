package ru.test;

public enum Result {
    ROCK,
    PAPER,
    SCISSORS;

    public boolean isBeats(Result another) {
        switch (this) {
            case SCISSORS: return another.equals(PAPER);
            case ROCK: return another.equals(SCISSORS);
            case PAPER: return another.equals(ROCK);
        }
        return false;
    }
}
