package EPAM_LECTURE_7.Pizza_cafe.model;

import EPAM_LECTURE_7.Pizza_cafe.model.Ingredients.Ingredient;

/**
 * Created by User on 22-Jan-18.
 */
public abstract class DecoratedPizza extends Pizza {
    private Pizza pizza;
    public abstract void addIngredient(Ingredient ingredient);

    public static Pizza getPizza() {
        return null;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
}
