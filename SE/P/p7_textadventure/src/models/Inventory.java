package models;

import java.util.ArrayList;
import java.util.Collections;

import exceptions.*;

/**
 * Class Inventory
 * Here Inventory Items can be stored and administered.
 */
public class Inventory {

    /** Storage for the Inventory item */
    private ArrayList<InventoryItem> items;

    /** Limits the number of items that can be put in the inventory. */
    final int maxNumberOfItems;

    /**
     * Constructor with size
     * 
     * @param size
     */
    public Inventory(int size) {
        items = new ArrayList<InventoryItem>();
        maxNumberOfItems = size;
    }

    /**
     * Adds an item to the inventory
     * 
     * @param item the item to be added
     * @throws InventoryFullException
     */
    public void addItem(InventoryItem item) throws InventoryFullException {
        if (items.size() < maxNumberOfItems) {
            items.add(item);
        } else {
            throw new InventoryFullException("Not enough space for " + item.getDisplayName());
        }
    }

    public int getSize() {
        return items.size();
    }

    /**
     * Calculates the altogehter weight of the inventory
     * 
     * @return the weight of the inventory
     */
    public int getWeight() {
        int totalWeight = 0;
        for (InventoryItem item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    /**
     * Gets an item with a specified index from the item storage
     * 
     * @param idx
     * @return a reference to the Item with the specified Index
     * @throws NotThereException
     */
    public InventoryItem getItem(int idx) throws NotThereException {
        InventoryItem item = items.get(idx);
        if (item != null) {
            return item;
        } else {
            throw new NotThereException();
        }
    }

    /**
     * Removes an item from the inventory
     * 
     * @param item the item to be removed
     */
    public void removeItem(InventoryItem item) {
        items.remove(item);
    }

    /**
     * Sorts the inventory
     */
    public void sort() {
        Collections.sort(items); // wichtig: InventoryItem muss nun Comparable implementieren!
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "items=" + items +
                ", currentNumberOfItems=" + items.size() +
                '}';
    }

    /**
     * List the content of the Inventory with running number (starting from 0)
     */
    public void list() {
        if (items.size() > 0) {
            for (int i = 0; i < items.size(); i++) {
                System.out.println(i + ":" + items.get(i).getDisplayName());
            }
        } else {
            System.out.println("Nichts enthalten im Inventar!");
        }
    }

    public int getMaxNumberOfItems() {
        return maxNumberOfItems;
    }
}
