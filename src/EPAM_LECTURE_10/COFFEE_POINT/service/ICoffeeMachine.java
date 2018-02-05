package EPAM_LECTURE_10.COFFEE_POINT.service;

import EPAM_LECTURE_10.COFFEE_POINT.model.Coffee;

public interface ICoffeeMachine {
    Coffee makeCoffee(CoffeeType coffeeType);
}
