package EPAM_LECTURE_10.COFFEE_POINT.model;

import EPAM_LECTURE_10.COFFEE_POINT.model.ingredients.Ingredient;

/**
 * Created by User on 04-Feb-18.
 */
public abstract class DecoratedCoffee extends Coffee {
    private Coffee decoratedCoffee = new Coffee();
    DecoratedCoffee(){}

    public DecoratedCoffee(Coffee coffee){
        decoratedCoffee = coffee;
    }

    public void addIngredient (Ingredient ingredient){
        decoratedCoffee.setName(decoratedCoffee.getName() + ingredient.getName());
        decoratedCoffee.setPrice(decoratedCoffee.getPrice() + ingredient.getPrice());
    }

    public Coffee getDecoratedCoffee() {
        return decoratedCoffee;
    }

    public void setDecoratedCoffee(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }
}
