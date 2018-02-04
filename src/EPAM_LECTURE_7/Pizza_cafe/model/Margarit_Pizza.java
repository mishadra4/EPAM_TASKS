package EPAM_LECTURE_7.Pizza_cafe.model;

import EPAM_LECTURE_7.Pizza_cafe.model.Ingredients.Cheese;
import EPAM_LECTURE_7.Pizza_cafe.model.Ingredients.Ingredient;


public class Margarit_Pizza extends DecoratedPizza {
    private Cheese cheese = new Cheese();

    Margarit_Pizza(){
        super.setPrice( super.getPrice() + cheese.getPrice());
        super.setName(super.getName() + cheese.getName());
    }

    public static Pizza getPizza(){
        return null;
    }
    @Override
    public void addIngredient(Ingredient ingredient) {
        super.getIngredients().add(cheese);
    }
}
