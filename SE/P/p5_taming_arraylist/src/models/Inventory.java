package models;

import java.util.ArrayList;

public class Inventory {

    // vars
    private int size;
    // private Item[] inventory;
    private ArrayList<Item> inventory; // ArrayList inventory

    // constructor
    public Inventory(int size) {
        this.size = size;
        // inventory = new Item[size]; // Array inventory
        inventory = new ArrayList<Item>(size); // ArrayList inventory
    }

    // methods
    // ArrayList inventory
    public Item addItem(Item item) {
        if (inventory.size() < size) {
            inventory.add(item);
            System.out.println("Item added to inventory: " + item.getName());
            return item;
        }
        System.out.println("Inventory is full, cant add: " + item.getName());
        return null;
    }

    public void listInventory() {
        for (Item item : inventory) {
            if (item != null) {
                item.printItem();
            }
        }
    }

    // Arrayinventory
    // public Item addItem(Item item) {
    // for (int i = 0; i < size; i++) {
    // if (inventory[i] == null) {
    // inventory[i] = item;
    // System.out.println("Item added to inventory: " + item.getName());
    // return item;
    // }
    // }
    // System.out.println("Inventory is full, cant add: " + item.getName());
    // return null;
    // }

    // public void listInventory() {
    // for (int i = 0; i < size; i++) {
    // if (inventory[i] != null) {
    // inventory[i].printItem();
    // }
    // }
    // }
}
