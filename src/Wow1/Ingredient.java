package Wow1;

public class Ingredient {

    String name;
    Double cost;

    public Ingredient(String name, Double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name + ", " + cost;
    }

    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }
}
