package restaurant.meal;

import java.util.List;

public class CookRecipe {
    public String name;
    public List<Ingredient> ingredientsList;
    public String instructions;
    public void addIngredient(Ingredient nextIngredient) {
        ingredientsList.add(nextIngredient);
    }

    public CookRecipe(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instruction) {
        this.instructions = instruction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(List<Ingredient> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }
    @Override
    public String toString() {
        StringBuilder recipeString = new StringBuilder();
        recipeString.append(name).append("\nIngredients:\n");
        for (Ingredient ingredient : ingredientsList) {
            recipeString.append(ingredient).append("\n");
        }
        recipeString.append("Instructions:\n").append(instructions);
        return recipeString.toString();
    }
}
