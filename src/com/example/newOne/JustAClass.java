package com.example.newOne;

public class JustAClass {

    public static void main(String[] args) {
        int lives = 3;
        boolean isGameOver = (lives < 1);

        if(isGameOver) {
            System.out.println("Game over!");
        } else {
            System.out.println("Your still alive");
        }
    }

}
