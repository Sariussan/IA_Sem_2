package models;

public class Armor extends InventoryItem {
    private double defense;

    // constructor
    public Armor(String name, double weight, double defense) {
        super(name, weight);
        this.defense = defense;
    }

    public Armor() {
        this("Kartoffelsack", 20.0, 1.0);
    }

    // methods
    @Override
    public void printItem() {
        System.out.println("id: " + id + " name: " + name + " weight: " + weight + " defense: " + defense);
    }

    public double getDefenseValue() {
        // more logic?
        return defense;
    }

    // getters and setters
    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }
}
