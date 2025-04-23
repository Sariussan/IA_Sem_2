package models;

public class MeleeWeapon extends Weapon {

    // vars
    private double damage;

    // constructor
    public MeleeWeapon(String name, double weight, double strength, double damage) {
        super(name, weight, strength);
        this.damage = damage;
    }

    public MeleeWeapon() {
        this("Stock", 2.0, 1.0, 1.0);
    }

    // methods

    // getters and setters
    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
