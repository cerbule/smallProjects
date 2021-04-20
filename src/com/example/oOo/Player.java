package com.example.oOo;

import com.example.newOne.Weapon;

import java.util.ArrayList;

public class Player {

    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<Loot> inventory;

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
//        this.handleName = handleName;
//        this.lives = 3;
//        this.level = startingLevel;
//        this.score = 0;
        setHandleName(handleName);
        setLives(3);
        setLevel(startingLevel);
        setScore(0);
        setDefaultWeapon();
        inventory = new ArrayList<>();

    }

    public void setNameAndLevel(String handleName, int level) {
        setHandleName(handleName);
        setLevel(level);
       // this.level = level;
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String value) {
        if (value.length() < 3) {
            System.out.println("The name " + this.handleName + " is too short.");
            return;
        } else {
            this.handleName = value;
        }
    }

    private void setDefaultWeapon() {
        this.weapon = new Weapon("Sword", 10, 20);
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

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Loot> getInventory() {
        return inventory;
    }

//    public void setInventory(ArrayList<Loot> inventory) {
//        this.inventory = inventory;
//    }

    public void pickUpLoot(Loot newLoot) {
        inventory.add(newLoot);
    }

    public boolean dropLoot(Loot droppedLoot) {
        if (this.inventory.contains(droppedLoot)) {
            inventory.remove(droppedLoot);
            return true;
        }
        return false;
    }

    public boolean dropLoot(String name) {
        for (Loot item : inventory) {
            if (item.getName().contains(name)) {
                this.inventory.remove(item);
                return true;
            }
        }
        return false;
    }

    public void showInventory() {

        for (Loot item : inventory) {
            System.out.println(item.getName());
        }
        System.out.println("=====================");
    }

    public int score() {
        int total = 0;
       // for (int i = 0; i < inventory.size(); i++) {
         // Loot currentLoot = inventory.get(i);
        for (Loot currentLoot : inventory) {

            System.out.println(currentLoot.getName() + " is worth " + currentLoot.getValue());
            total = total + currentLoot.getValue();
        }
        return total;
    }
}
