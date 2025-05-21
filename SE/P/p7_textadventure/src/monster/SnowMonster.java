package monster;

public class SnowMonster extends Monster {
    private double iceStrength;


    public SnowMonster(String name, int strength, double iceStrength) {
        super(name, strength);
        this.iceStrength = iceStrength;
    }

    public void freeze() {
        System.out.println(this.name + " freezes its foe!");
    }

    @Override
    public void fight(Monster foe) {
        System.out.println(this.name + " uses ice in the fight!");
        this.strength += iceStrength;
        super.fight(foe);
    }

    //getters and setters
    public double getIceStrength() {
        return iceStrength;
    }

    public void setIceStrength(double iceStrength) {
        this.iceStrength = iceStrength;
    }
}