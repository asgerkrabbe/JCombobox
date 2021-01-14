package Wow1;

public class Ingredient {

    String name;

    public Ingredient(int index, String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
