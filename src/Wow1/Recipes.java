package Wow1;

import java.util.*;

public class Recipes {
    String name;

    public Recipes(String name) {
        this.name = name;
    }

    public Recipes() {
    }

    @Override
    public String toString() {
        return name;
    }

    public void addstuff(ArrayList<Recipes> recipesArrayList) {
        HashMap<String, Double> ingredientMap = new HashMap<>();

        ArrayList<Ingredient> recipeIngredients = new ArrayList<>();

        Recipes recipe1 = new Recipes("Potion 1");
        Recipes recipe2 = new Recipes("Potion 2");

        ingredientMap.put("Ingredient 1", 50.0);
        Ingredient ingredient1 = new Ingredient("Ingredient 1", ingredientMap.get("Ingredient 1"));

        recipesArrayList.add(recipe1);
        recipesArrayList.add(recipe2);
        recipeIngredients.add(ingredient1);

    }
}
