package monster;

import interfaces.Tameable;

public class Monster implements Tameable {
    protected String name;
    protected double strength;
    HeroOld Tamer;
    private boolean tameable = false;

    // constructor
    public Monster(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    // methods
    public void fight(Monster foe) {
        System.out.println(this.name + " fights " + foe.name);
        if (this.strength > foe.strength) {
            System.out.println(this.name + " wins!");
        } else if (this.strength < foe.strength) {
            System.out.println(foe.name + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    public void getTamed(HeroOld Tamer) {
        System.out.println(this.name + " gets tamed by " + Tamer.name);
        // some fancy code to make this work
        if (this.Tamer == null && this.tameable) {
            this.Tamer = Tamer;
        }
    }

    public void cuddle(int value) {
        if (Tamer != null) {
            System.out.println(this.name + " cuddles " + Tamer.getName());
            Tamer.receiveCuddle(value);
        }

    }

    // getters and setters
    public String getName() {
        return name;
    }

    public double getStrength() {
        return strength;
    }

    public boolean isTameable() {
        return tameable;
    }

    public void setTameable(boolean tameable) {
        this.tameable = tameable;
    }
}