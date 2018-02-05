package EPAM_LECTURE_10.COFFEE_POINT.model.ingredients;

/**
 * Created by User on 04-Feb-18.
 */
public class Ingredient {
    private String name = "";
    private double price = 0.0;

    public Ingredient() {}

    public Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name += name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price += price;
    }
}
