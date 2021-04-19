package com.example.oOo;


public class Demo {

    public static void main(String[] args) {

//        VampyreKing dracula = new VampyreKing("Dracula");
//        dracula.showInfo();
//
//        dracula.setLives(0);
//        //while (dracula.getLives() > 0) {
//        do {
//            if (dracula.dodges()) {
//                dracula.setLives(dracula.getLives() + 1);
//                continue;
//            }
//            if (dracula.runAway()) {
//                System.out.println("Dracula run away");
//                break;
//            } else {
//                dracula.takeDamage(12);
//                dracula.showInfo();
//            }
//        } while (dracula.getLives() > 0);
//        System.out.println("======================================================");

//        Enemy enemy = new Enemy("test enemy", 10, 3);
//        enemy.showInfo();
//        enemy.takeDamage(3);
//        enemy.showInfo();
//        enemy.takeDamage(8);
//        enemy.showInfo();

//        Troll uglyTroll = new Troll("Ugly Troll");
//        uglyTroll.showInfo();
//        uglyTroll.takeDamage(38);
//
//        Vampire vlad = new Vampire("Vlad");
//        vlad.showInfo();
//        vlad.takeDamage(8);
//        vlad.showInfo();


        Player conan = new Player("Conan");
        conan.pickUpLoot(new Loot("Invisibility", LootType.POTION, 4));
        conan.pickUpLoot(new Loot("Mithril", LootType.ARMOUR, 183));
        conan.pickUpLoot(new Loot("Ring of speed", LootType.RING, 25));
        conan.pickUpLoot(new Loot("Red Potion", LootType.POTION, 2));
        conan.pickUpLoot(new Loot("Cursed Shield", LootType.ARMOUR, -8));
        conan.pickUpLoot(new Loot("Brass Ring", LootType.RING, 1));
        conan.pickUpLoot(new Loot("Chain Mail", LootType.ARMOUR, 4));
        conan.pickUpLoot(new Loot("Gold Ring", LootType.RING, 12));
        conan.pickUpLoot(new Loot("Health Potion", LootType.POTION, 3));
        conan.pickUpLoot(new Loot("Silver Ring", LootType.RING, 6));
        conan.showInventory();
        System.out.println(conan.score());
        conan.dropLoot("Cursed Shield");
        System.out.println(conan.score());
    }

}
