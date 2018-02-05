package EPAM_LECTURE_10.COFFEE_POINT.model.ingredients;

import EPAM_LECTURE_10.COFFEE_POINT.model.ingredients.Ingredient;

/**
 * Created by User on 04-Feb-18.
 */
public class Vanila extends Ingredient {
    private double price = 3.00;
    private String name = "Vanila";
    public Vanila() {
        super.setPrice(price);
        super.setName(name);
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public double getPrice() {
        return super.getPrice();
    }

    public void setPrice(double price) {
        super.setPrice(price);
    }
}
