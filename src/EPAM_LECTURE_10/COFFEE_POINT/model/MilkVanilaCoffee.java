package EPAM_LECTURE_10.COFFEE_POINT.model;

import EPAM_LECTURE_10.COFFEE_POINT.model.ingredients.Milk;
import EPAM_LECTURE_10.COFFEE_POINT.model.ingredients.Vanila;


public class MilkVanilaCoffee extends DecoratedCoffee {
    Milk milk = new Milk();
    Vanila vanila = new Vanila();

    MilkVanilaCoffee() {
        super.addIngredient(milk);
        super.addIngredient(vanila);
    }
}
