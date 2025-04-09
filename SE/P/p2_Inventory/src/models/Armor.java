package models;

public class Armor extends Item {
    private double defense;

    // constructor
    public Armor(int id, String name, double weight, double defense) {
        super(id, name, weight);
        this.defense = defense;
    }

    // methods
    @Override
    public void printItem() {
        System.out.println("id: " + id + " name: " + name + " weight: " + weight + " defense: " + defense);
    }

    public double getDefenseValue() {
        //more logic?
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
