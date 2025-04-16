package models;

public class Food extends Item {
    private int healthRestored;

    // constructor
    public Food(int id, String name, double weight, int healthRestored) {
        super(id, name, weight);
        this.healthRestored = healthRestored;
    }

    public Food() {
        this(1, "Kartoffel", 0.2, 1);
    }

    // methods
    @Override
    public void printItem() {
        System.out.println("id: " + id + " name: " + name + " weight: " + weight + " healthRestored: " + healthRestored);
    }

    public int cook() {
        //more logic?

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
