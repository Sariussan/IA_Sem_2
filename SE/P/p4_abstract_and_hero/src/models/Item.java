package models;

public abstract class Item {
    protected int id;
    protected String name;
    protected double weight;
    private static int itemCount;

    // constructor
    public Item(String name, double weight) {
        this.id = itemCount;
        this.name = name;
        this.weight = weight;
        itemCount++;
    }

    // methods
    public abstract void printItem();

    // control class getters and setters
    public static int getItemCount() {
        return itemCount;
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}