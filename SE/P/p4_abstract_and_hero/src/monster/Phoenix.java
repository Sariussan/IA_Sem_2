package monster;

public final class Phoenix extends FireMonster {
    private int healStrength;

    public Phoenix(String name, int strength) {
        super(name, strength);
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
    public int getHealStrength() {
        return healStrength;
    }

    public void setHealStrength(int healStrength) {
        this.healStrength = healStrength;
    }
}