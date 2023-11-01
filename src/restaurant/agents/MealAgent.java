package restaurant.agents;

import jade.core.Agent;
import restaurant.meal.CookRecipe;
import restaurant.meal.Ingredient;

import java.util.SortedMap;

public class MealAgent extends Agent {
    CookRecipe appleCookiesRecipe = new CookRecipe("Apple Cookies");
    protected void setup() {
        // Инициализация на агента
        System.out.println("Agent " + getLocalName() + " is ready.");

        init(appleCookiesRecipe);

       // System.out.println(appleCookiesRecipe);
       // doDelete();
    }
    protected void init(CookRecipe appleCookiesRecipe) {
       // CookRecipe appleCookiesRecipe = new CookRecipe("Apple Cookies");

        appleCookiesRecipe.addIngredient(new Ingredient(1, "(12-ounce) package", "frozen escalloped apples"));
        appleCookiesRecipe.addIngredient(new Ingredient(1, "cup", "granulated sugar"));
        appleCookiesRecipe.addIngredient(new Ingredient(1, "cup", "packed brown sugar"));
        appleCookiesRecipe.addIngredient(new Ingredient(2.0 / 3, "cup", "vegetable shortening"));
        appleCookiesRecipe.addIngredient(new Ingredient(2.0 / 3, "cup", "butter"));
        appleCookiesRecipe.addIngredient(new Ingredient(2, "large", "eggs"));
        appleCookiesRecipe.addIngredient(new Ingredient(1, "teaspoon", "vanilla extract"));
        appleCookiesRecipe.addIngredient(new Ingredient(3.5, "cups", "all-purpose flour"));
        appleCookiesRecipe.addIngredient(new Ingredient(1, "teaspoon", "salt"));
        appleCookiesRecipe.addIngredient(new Ingredient(1, "cup", "chopped nuts"));

        appleCookiesRecipe.setInstructions("\n1. Preheat oven to 375°F (190°C).\n" +
                "2. Mix granulated sugar, brown sugar, shortening, butter, eggs, and vanilla extract in a large bowl.\n" +
                "3. Stir in flour, escalloped apples, salt, and nuts.\n" +
                "4. Drop dough by rounded teaspoons onto ungreased baking sheets.\n" +
                "5. Bake for 8 to 10 minutes. Cool for 1 minute. Remove to wire racks to cool completely.");

        for (int i = 0; i < appleCookiesRecipe.ingredientsList.size(); i++) {
        System.out.println(appleCookiesRecipe.getIngredientsList().get(i));
        }
        System.out.println(appleCookiesRecipe);

    }
}
