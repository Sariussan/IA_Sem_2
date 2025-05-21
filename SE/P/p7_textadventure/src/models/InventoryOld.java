package models;

import java.util.ArrayList;

public class InventoryOld {

    // vars
    private int size;
    private ArrayList<InventoryItem> inventory; // ArrayList inventory

    // constructor
    public InventoryOld(int size) {
        this.size = size;
        inventory = new ArrayList<InventoryItem>(size); // ArrayList inventory
    }

    // methods
    // ArrayList inventory
    public InventoryItem addItem(InventoryItem item) {
        if (inventory.size() < size) {
            inventory.add(item);
            System.out.println("Item added to inventory: " + item.getName());
            return item;
        }
        System.out.println("Inventory is full, cant add: " + item.getName());
        return null;
    }

    public void listInventory() {
        for (InventoryItem item : inventory) {
            if (item != null) {
                item.printItem();
            }
        }
    }
}
