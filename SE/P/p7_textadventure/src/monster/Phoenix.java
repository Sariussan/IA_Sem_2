package monster;

import interfaces.Companion;

import java.lang.Math;

public final class Phoenix extends FireMonster implements Companion {
    private double healStrength;

    public Phoenix(String name, int strength, double fireStrength, double healStrength) {
        super(name, strength, fireStrength);
        this.healStrength = healStrength;
    }

    public void resurrect() {
        System.out.println(this.name + " resurrects from the ashes!");
    }

    @Override
    public void fight(Monster foe) {
        System.out.println(this.name + " fights with fiery rebirth!");
        this.strength += healStrength; // Phoenix ability increases strength -> permanent
        super.fight(foe);
    }

    @Override
    public void getTamed(Hero Tamer) {
        double randomNumber = Math.random();
        if (this.Tamer == null) {
            System.out.println(Tamer.getName() + "is trying to tame" + this.name );
            if(randomNumber > 0.66) {
                System.out.println(Tamer.getName() + " tamed " + this.name + "!" );
                this.Tamer = Tamer;
            }else {
                System.out.println(Tamer.getName() + " failed to tame " + this.name + "." );
            }
        }
    }

    //getters and setters
    public double getHealStrength() {
        return healStrength;
    }

    public void setHealStrength(double healStrength) {
        this.healStrength = healStrength;
    }
}