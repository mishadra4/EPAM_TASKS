package EPAM_LECTURE_6.COFFEE_POINT.service;

import EPAM_LECTURE_6.COFFEE_POINT.model.CoffeeBrand;


public class CoffeeMachineFactory {
    public static ICoffeeMachine getCoffeeMachine(String coffeeBrand){
        if(CoffeeBrand.valueOf(coffeeBrand).equals(CoffeeBrand.ILLY)){
            return new IllyCoffeeMachine();
        }
        if(CoffeeBrand.valueOf(coffeeBrand).equals(CoffeeBrand.LAVAZZA)){
            return new LavazzaCoffeeMachine();
        }
        return null;
    }
}
