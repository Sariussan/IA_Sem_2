package models;

public class Weapon extends Item {
    private double strength;

    // constructor
    public Weapon(String name, double weight, double strength) {
        super(name, weight);
        this.strength = strength;
    }

    //methods
    @Override
    public void printItem() {
        System.out.println("id: " + id + " name: " + name + " weight: " + weight + " strength: " + strength);
    }

    public double getAttackValue(double distance) {
            return strength;
    }

    // getters and setters
    public double getStrength() {
        return strength;
    }



    public void setStrength(double strength) {
        this.strength = strength;
    }


}
