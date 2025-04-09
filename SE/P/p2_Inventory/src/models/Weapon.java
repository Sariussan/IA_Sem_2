package models;

public class Weapon extends Item {
    private double strength;
    private double range;
    private double damage;

    // constructor
    public Weapon(int id, String name, double weight, double strength, double range, double damage) {
        super(id, name, weight);
        this.strength = strength;
        this.range = range;
        this.damage = damage;
    }

    //methods
    @Override
    public void printItem() {
        System.out.println("id: " + id + " name: " + name + " weight: " + weight + " strength: " + strength);
    }

    public double getAttackValue(double distance) {
        if (distance < range) {
            return strength * damage;
        } else {
            return 0;
        }
    }

    // getters and setters
    public double getStrength() {
        return strength;
    }

    public double getRange() {
        return range;
    }

    public double getDamage() {
        return damage;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
