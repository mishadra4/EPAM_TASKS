package EPAM_LECTURE_10.COFFEE_POINT.model;

import EPAM_LECTURE_10.COFFEE_POINT.model.ingredients.Milk;

public class MilkCoffee extends DecoratedCoffee {
    Milk milk = new Milk();

    MilkCoffee() {
        super.addIngredient(milk);
    }

}
