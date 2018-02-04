package EPAM_LECTURE_10.COFFEE_POINT.service;

import EPAM_LECTURE_10.COFFEE_POINT.model.Coffee;
import EPAM_LECTURE_10.COFFEE_POINT.model.CoffeeType;

public interface ICoffeeMachine {
    Coffee makeCoffee(CoffeeType coffeeType);
}
