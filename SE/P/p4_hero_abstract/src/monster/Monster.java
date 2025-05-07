package monster;

public class Monster {
    protected String name;
    protected double strength;

    public Monster(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

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

    public String getName() {
        return name;
    }

    public double getStrength() {
        return strength;
    }
}