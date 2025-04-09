package models;

public class Potion extends Item {
    private String effect;

    // constructor
    public Potion(int id, String name, double weight, String effect) {
        super(id, name, weight);
        this.effect = effect;
    }

    // methods
    @Override
    public void printItem() {
        System.out.println("id: " + id + " name: " + name + " weight: " + weight + " effect: " + effect);
    }

    public String applyEffect() {
        //more logic?

        return effect;
    }

    // getters and setters
    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }
}
