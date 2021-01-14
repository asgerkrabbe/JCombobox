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

    public void addStuff(ArrayList<Recipes> recipesArrayList,
                         HashMap<Integer,String> ingredientMap) {

        ArrayList<Ingredient> recipeIngredients = new ArrayList<>();

        Recipes recipe1 = new Recipes("Spectral Flask of Power");
        Recipes recipe2 = new Recipes("Potion 2");

        ingredientMap.put(0,"Widowbloom");
        ingredientMap.put(1,"Nightshade");
        ingredientMap.put(2,"Rising Glory");
        ingredientMap.put(3,"Marrowroot");
        ingredientMap.put(4,"Vigil's Torch");
        ingredientMap.put(5,"Nightshade");
        ingredientMap.put(6,"Nightshade");
        ingredientMap.put(7,"Nightshade");
        ingredientMap.put(8,"Nightshade");
        Ingredient ingredient1 = new Ingredient(0, ingredientMap.get(0));

        recipesArrayList.add(recipe1);
        recipesArrayList.add(recipe2);
        recipeIngredients.add(ingredient1);

    }
}
