package ru.test;

public abstract class Player {
    private String name = "Player";
    public abstract Result getResult();

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
