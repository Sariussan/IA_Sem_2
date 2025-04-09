package models;

public class Inventory {

    // vars
    private int size;
    private Item[] inventory;

    // constructor
    public Inventory(int size) {
        this.size = size;
        inventory = new Item[size];
    }

    // methods
    public Item addItem(Item item) {
        for(int i = 0; i < size; i++) {
            if(inventory[i] == null) {
                inventory[i] = item;
                return item;
            }
        }
        System.out.println("Inventory is full");
        return null;
    }

    public void listInventory() {
        for(int i = 0; i < size; i++) {
            if(inventory[i] != null) {
                inventory[i].printItem();
            }
        }


    }
}
