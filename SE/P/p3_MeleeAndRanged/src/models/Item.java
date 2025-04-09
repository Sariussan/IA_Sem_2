package models;

public class Item {
    protected int id;
    protected String name;
    protected double weight;

    //constructor
    public Item(int id, String name, double weight) {
        this.id =  id;
        this.name = name;
        this.weight = weight;
    }

    // methods
    public void printItem() {}

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