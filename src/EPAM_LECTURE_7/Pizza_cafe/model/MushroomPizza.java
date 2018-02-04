package EPAM_LECTURE_7.Pizza_cafe.model;

import EPAM_LECTURE_7.Pizza_cafe.model.Ingredients.Cheese;
import EPAM_LECTURE_7.Pizza_cafe.model.Ingredients.Ingredient;
import EPAM_LECTURE_7.Pizza_cafe.model.Ingredients.Mushroom;

import java.io.CharConversionException;

/**
 * Created by User on 22-Jan-18.
 */
public class MushroomPizza extends DecoratedPizza {
    Mushroom mushroom = new Mushroom();
    Cheese cheese = new Cheese();

    MushroomPizza(){
        super.setPrice( super.getPrice() + mushroom.getPrice() + cheese.getPrice());
        super.setName(super.getName() + mushroom.getName() + cheese.getName());
    }

    @Override
    public void addIngredient(Ingredient ingredient) {

    }
}
