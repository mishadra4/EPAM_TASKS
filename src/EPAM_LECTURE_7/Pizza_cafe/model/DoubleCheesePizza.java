package EPAM_LECTURE_7.Pizza_cafe.model;

import EPAM_LECTURE_7.Pizza_cafe.model.Ingredients.Cheese;
import EPAM_LECTURE_7.Pizza_cafe.model.Ingredients.Ingredient;

/**
 * Created by User on 22-Jan-18.
 */
public class DoubleCheesePizza extends DecoratedPizza{
    Cheese cheese = new Cheese();
    DoubleCheesePizza(){
        super.setPrice( super.getPrice() + 2*cheese.getPrice());
        super.setName(super.getName() + cheese.getName() + cheese.getName());
    }
    @Override
    public void addIngredient(Ingredient ingredient) {
        super.getIngredients().add(cheese);
        super.getIngredients().add(cheese);
    }
}
