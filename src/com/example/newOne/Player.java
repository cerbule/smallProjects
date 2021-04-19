package com.example.newOne;

public class Player {

    private String handleName;
    private int lives;
    private int level;
    private int score;

    public Player() {

        this("Unknown player");

    }

    public Player(String handleName) {

        this(handleName, 1);

//        this.handleName = handleName;
//        lives = 3;
//        level = 1;
//        score = 0;

    }

    public Player(String handleName, int startingLevel) {
        this.handleName = handleName;
        this.lives = 3;
        this.level = startingLevel;
        this.score = 0;
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String value) {
        if (value.length() < 3) {
            return;
        } else {
            this.handleName = value;
        }
    }

    public int getLives() {
        return this.lives;
    }

    public int getLevel() {
        return this.level;
    }

    public int getScore() {
        return this.score;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
