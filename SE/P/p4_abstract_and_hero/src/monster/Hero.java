package monster;

public class Hero extends Monster {
    private int health;
    private final int MAX_HEALTH;

    public Hero(String name, int strength, int maxHealth) {
        super(name, strength);
        this.strength = strength;
        this.MAX_HEALTH = maxHealth;
        this.health = maxHealth;
    }

    public void fight(Monster foe) {
        System.out.println(this.name + " fights " + foe.getName());
        if (this.strength > foe.getStrength()) {
            System.out.println(this.name + " wins!");
        } else if (this.strength < foe.getStrength()) {
            System.out.println(foe.getName() + " wins!");
            this.health -= foe.getStrength(); // Hero loses health
        } else {
            System.out.println("It's a draw!");
        }
    }

    public void heal() {
        this.health = MAX_HEALTH;
        System.out.println(this.name + " is fully healed!");
    }
    public int getHealth() {
        return health;
    }
}