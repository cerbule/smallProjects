package com.example.newOne;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        Player tim = new Player("Tom Smith", 8);
//        System.out.println("Player name: " + tim.getHandleName());
//        System.out.println("Level: " + tim.getLevel());
//        System.out.println("Lives: " + tim.getLives());
//        System.out.println(tim.getWeapon().getName() + " is the weapon of choice");
//        Weapon timsWeapon = tim.getWeapon();
//        System.out.println(timsWeapon.getName());
//        System.out.println(tim.getWeapon().getName() + " is the weapon of choice");

        Weapon myAxe = new Weapon("Goldshine Axe", 15, 20);
        tim.setWeapon(myAxe);
//        System.out.println(tim.getWeapon().getName());

        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
        tim.pickUpLoot(redPotion);

        tim.pickUpLoot(new Loot("+3 Chest Armor", LootType.ARMOUR, 80));
        tim.pickUpLoot(new Loot("Ring of Protection +2", LootType.RING, 40));
        tim.pickUpLoot(new Loot("Invisibility Potion", LootType.POTION, 35));
       // tim.dropLoot(redPotion);
        tim.showInventory();

        //Loot bluePotion = new Loot("Blue potion", LootType.POTION, 17);
        boolean wasDeleted = tim.dropLoot(redPotion);
        System.out.println(wasDeleted);
        tim.showInventory();

    }

}
