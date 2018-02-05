package EPAM_LECTURE_10.COFFEE_POINT.model;

import EPAM_LECTURE_10.COFFEE_POINT.model.ingredients.Chocolate;
import EPAM_LECTURE_10.COFFEE_POINT.model.ingredients.Milk;


public class MilkChocolateCoffee extends DecoratedCoffee{
    Milk milk = new Milk();
    Chocolate chocolate = new Chocolate();

    MilkChocolateCoffee() {
        super.addIngredient(milk);
        super.addIngredient(chocolate);
    }

}
