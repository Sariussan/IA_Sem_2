package monster;

public final class Phoenix extends FireMonster {
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
        this.strength += healStrength; // Phoenix ability increases strength
        super.fight(foe);
    }

    //getters and setters
    public double getHealStrength() {
        return healStrength;
    }

    public void setHealStrength(double healStrength) {
        this.healStrength = healStrength;
    }
}