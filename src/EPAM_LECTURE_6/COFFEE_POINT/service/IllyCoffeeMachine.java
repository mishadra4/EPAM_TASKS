package EPAM_LECTURE_6.COFFEE_POINT.service;

import EPAM_LECTURE_6.COFFEE_POINT.model.Coffee;
import EPAM_LECTURE_6.COFFEE_POINT.model.CoffeeBrand;
import EPAM_LECTURE_6.COFFEE_POINT.model.CoffeeType;

public class IllyCoffeeMachine implements ICoffeeMachine {

    CoffeeBrand coffeeBrand = CoffeeBrand.ILLY;

    @Override
    public Coffee makeCoffee(CoffeeType coffeeType) {
        return new Coffee(coffeeBrand, coffeeType);
    }

    public CoffeeBrand getCoffeeBrand() {
        return coffeeBrand;
    }
}