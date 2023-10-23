package restaurant.meal;

import java.util.List;

public class CookRecipe {
    String name;
    List<String> ingredientsList;
    public void addIngredient(String nextIngredient) {
        ingredientsList.add(nextIngredient);
    }
}
