package monster;

public class FireMonster extends Monster {
    private double fireStrength;


    public FireMonster(String name, int strength) {
        super(name, strength);
    }

    public void setOnFire() {
        System.out.println(this.name + " sets its foe on fire!");
    }

    @Override
    public void fight(Monster foe) {
        System.out.println(this.name + " uses fire in the fight!");
        this.strength += fireStrength; // Fire ability increases strength
        super.fight(foe);
    }

    //getters and setters
    public double getFireStrength() {
        return fireStrength;
    }

    public void setFireStrength(double fireStrength) {
        this.fireStrength = fireStrength;
    }
}