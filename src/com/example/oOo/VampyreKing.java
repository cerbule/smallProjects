package com.example.oOo;

import java.util.Random;

public class VampyreKing extends Vampire {

    public VampyreKing(String name) {
        super(name);
        setHitPoints(140);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage / 2);
    }

    public boolean runAway() {
        if (getLives() < 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean dodges() {
        Random rand = new Random();
        int chance = rand.nextInt(6);
        if (chance > 3) {
            System.out.println("Dracula doges");
            return true;
        }
        return false;
    }
}
