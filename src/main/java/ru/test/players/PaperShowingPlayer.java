package ru.test.players;

import ru.test.Player;
import ru.test.Result;

public class PaperShowingPlayer extends Player {
    public Result getResult() {
        return Result.PAPER;
    }
}
