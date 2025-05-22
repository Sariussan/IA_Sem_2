package programs;

import models.*;
import monster.*;
import level.*;

public class Game {

    // vars
    private Inventory inventory;

    // constructor
    public Game() {
    }

    // methods
    public void runGame1() {
        inventory = new Inventory(3);

        // setup
        Weapon weapon1 = new MeleeWeapon("schwert", 2.5, 5.0, 5.0);
        System.out.println("Item Count: " + InventoryItem.getItemCount());
        Weapon weapon2 = new RangedWeapon("Bogen", 2.5, 5.0, 15.0);
        System.out.println("Item Count: " + InventoryItem.getItemCount());
        Potion potion1 = new Potion("Heiltrank", 1.0, "Heilung 5");
        System.out.println("Item Count: " + InventoryItem.getItemCount());
        Armor armor1 = new Armor("Rüstung", 10.0, 50.0);
        System.out.println("Item Count: " + InventoryItem.getItemCount());
        Food food1 = new Food("Schweinsbratenkit", 5.0, 20);
        System.out.println("Item Count: " + InventoryItem.getItemCount());
        try {
            this.inventory.addItem(weapon1);
            this.inventory.addItem(weapon2);
            this.inventory.addItem(potion1);
            this.inventory.addItem(armor1);
            this.inventory.addItem(food1);
        } catch (Exception e) {
            // This is unnecessary
        }

        // print items
        // inventory.listInventory();

        // use methods of items

        // Monsters and Heroes
        HeroOld hero = new HeroOld("Otto", 50, 100);
        Monster fireMonster = new FireMonster("FeuerBert", 40, 10);
        Monster iceMonster = new SnowMonster("Eisbär(t)", 30, 20);
        Phoenix phoenix = new Phoenix("Feuervogel", 60, 10, 20);

        // tamingtest
        phoenix.getTamed(hero);

        // powers get increased permanently, so the game can only run once or it will
        // stack
        hero.fight(fireMonster);
        fireMonster.fight(iceMonster);
        phoenix.cuddle(20);
        phoenix.resurrect();
        phoenix.fight(hero);

    }

    public void runGame2() {
        // Held erstellen
        Hero hero = new Hero("Hackl Schorsch", 100, 200);

        // Räume erstellen
        Room room1 = new Room("Brauereieingang", "Da gehts nei.");
        Room room2 = new Room("Schankraum", "Hier gibts Bier.");
        Room room3 = new Room("Kassenraum", "Biergeldaufbewahrungsörtlichkeit.");

        // Verbinden
        room1.addAdjacentRoom(room2);
        room2.addAdjacentRoom(room1);
        room2.addAdjacentRoom(room3);
        room3.addAdjacentRoom(room2);

        Weapon krug = new MeleeWeapon("Maßkrug", 3.0, 10.0, 15.0);
        Potion hoibe = new Potion("Weißbier", 0.5, "Stellt 20 HP wieder her");
        Armor lederhose = new Armor("Lederbix", 5.0, 30.0);
        room1.addItem(lederhose);
        room2.addItem(hoibe);
        room3.addItem(krug);

        // Schöne neue Welt
        World world = new World(hero);
        world.setCurrentRoom(room1);

        // Spielstart
        world.start();
    }

    // main method
    public static void main(String[] args) {
        Game game = new Game();
        game.runGame2();
    }
}

// Items