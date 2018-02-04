package EPAM_LECTURE_10.COFFEE_POINT.model;

import EPAM_LECTURE_10.COFFEE_POINT.model.ingredients.Ingredient;

/**
 * Created by User on 04-Feb-18.
 */
public abstract class CoffeeDecorator extends Coffee {
    private Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee coffee){
        decoratedCoffee = coffee;
    }

    public abstract void addIngredient (Ingredient ingredient);

}
