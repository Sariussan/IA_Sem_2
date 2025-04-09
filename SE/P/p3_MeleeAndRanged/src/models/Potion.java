package models;

public class Potion extends Item {
    private String effect;

    // constructor
    public Potion(int id, String name, double weight, String effect) {
        super(id, name, weight);
        this.effect = effect;
    }

    public Potion() {
        this(1, "Gerolsteiner medium", 1.0, "durstig machen");
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
