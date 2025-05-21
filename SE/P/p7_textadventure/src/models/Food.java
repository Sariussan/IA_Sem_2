package models;

public class Food extends InventoryItem {
    private int healthRestored;

    // constructor
    public Food(String name, double weight, int healthRestored) {
        super(name, weight);
        this.healthRestored = healthRestored;
    }

    public Food() {
        this("Kartoffel", 0.2, 1);
    }

    // methods
    @Override
    public void printItem() {
        System.out
                .println("id: " + id + " name: " + name + " weight: " + weight + " healthRestored: " + healthRestored);
    }

    public int cook() {
        // more logic?

        return healthRestored;
    }

    // getters and setters

    public int getHealthRestored() {
        return healthRestored;
    }

    public void setHealthRestored(int healthRestored) {
        this.healthRestored = healthRestored;
    }
}
