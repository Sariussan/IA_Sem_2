package programs;

import models.*;
import monster.*;

public class Game {

    // vars
    private Inventory inventory;

    // constructor
    public Game() {
        inventory = new Inventory(3);
    }

    // methods
    public void runGame() {

        // setup
        Weapon weapon1 = new MeleeWeapon("schwert", 2.5, 5.0, 5.0);
        System.out.println("Item Count: " + Item.getItemCount());
        Weapon weapon2 = new RangedWeapon("Bogen", 2.5, 5.0, 15.0);
        System.out.println("Item Count: " + Item.getItemCount());
        Potion potion1 = new Potion("Heiltrank", 1.0, "Heilung 5");
        System.out.println("Item Count: " + Item.getItemCount());
        Armor armor1 = new Armor("Rüstung", 10.0, 50.0);
        System.out.println("Item Count: " + Item.getItemCount());
        Food food1 = new Food("Schweinsbratenkit", 5.0, 20);
        System.out.println("Item Count: " + Item.getItemCount());
        this.inventory.addItem(weapon1);
        this.inventory.addItem(weapon2);
        this.inventory.addItem(potion1);
        this.inventory.addItem(armor1);
        this.inventory.addItem(food1);

        // print items
        inventory.listInventory();

        // use methods of items

        // Monsters and Heroes
        Hero hero = new Hero("Otto", 50, 100);
        Monster fireMonster = new FireMonster("FeuerBert", 40, 10);
        Monster iceMonster = new SnowMonster("Eisbär(t)", 30, 20);
        Phoenix phoenix = new Phoenix("Feuervogel", 60, 10, 20);

        // powers get increased permanently, so the game can only run once or it will stack
        hero.fight(fireMonster);
        fireMonster.fight(iceMonster);
        phoenix.resurrect();
        phoenix.fight(hero);

    }

    // main method
    public static void main(String[] args) {
        Game game = new Game();
        game.runGame();
    }
}
