package models;

import org.w3c.dom.ranges.Range;

public class RangedWeapon extends Weapon{

    // vars
    private double range;

    // constructor
    public RangedWeapon(int id, String name, double weight, double strength, double range) {
        super(id, name, weight, strength);
        this.range = range;
    }

    // DefaultConstructor
    public RangedWeapon() {
        this(1, "Stein", 2.0, 1.0, 5.0);
    }

    // methods

    // getters and setters
    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }
}
