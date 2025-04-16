package programs;

import models.*;

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
        Weapon weapon1 = new MeleeWeapon(1, "schwert", 2.5, 5.0, 5.0);
        Weapon weapon2 = new RangedWeapon(1, "Bogen", 2.5, 5.0, 15.0);
        Potion potion1 = new Potion(2, "Heiltrank", 1.0, "Heilung 5");
        Armor armor1 = new Armor(3, "Rüstung", 10.0, 50.0);
        Food food1 = new Food(4, "Schweinsbratenkit", 5.0, 20);
        this.inventory.addItem(weapon1);
        this.inventory.addItem(weapon2);
        this.inventory.addItem(potion1);
        this.inventory.addItem(armor1);
        this.inventory.addItem(food1);

        // print items
        inventory.listInventory();

        // use methods of items



    }

    //main method
    public static void main(String[] args) {
        Game game = new Game();
        game.runGame();
    }
}
