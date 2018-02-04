package EPAM_LECTURE_7.Pizza_cafe.model;

import EPAM_LECTURE_7.Pizza_cafe.model.Ingredients.Ham;
import EPAM_LECTURE_7.Pizza_cafe.model.Margarit_Pizza;

/**
 * Created by User on 22-Jan-18.
 */
public class AdvancedMargaretPizza extends Margarit_Pizza {
    private String name = "Advanced Margaret Pizza";
    private double price;
    private Ham ham = new Ham();

    AdvancedMargaretPizza(){
        super.setPrice( super.getPrice() + ham.getPrice());
        super.setName(super.getName() + ham.getName());
    }
}
