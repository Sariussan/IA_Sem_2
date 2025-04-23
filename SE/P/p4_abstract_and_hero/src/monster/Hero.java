package monster;

public class Hero {
    private String name;
    private int strength;
    private int health;
    private final int MAX_HEALTH;

    public Hero(String name, int strength, int maxHealth) {
        this.name = name;
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
            this.health -= 10; // Hero loses health
        } else {
            System.out.println("It's a draw!");
        }
    }

    public void heal() {
        this.health = MAX_HEALTH;
        System.out.println(this.name + " is fully healed!");
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getHealth() {
        return health;
    }
}