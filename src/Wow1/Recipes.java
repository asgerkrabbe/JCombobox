package Wow1;

import java.util.ArrayList;
import java.util.HashMap;

public class Recipes {
    String name;
    String ingredientName;
    int amount;

    public Recipes(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Recipes{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Recipes recipe1 = new Recipes("Recipe 1");

        HashMap<Integer,String> ingredientMap = new HashMap<>();


        ArrayList<Recipes> recipeArray = new ArrayList<>();
        ArrayList<String> recipeIngredients = new ArrayList<>();

        recipeIngredients.add(0,"Ingredient 1");
        recipeIngredients.add(1,"Ingredient 2");

        recipeArray.add(recipe1);
        recipeArray.forEach(System.out::println);


    }
}
