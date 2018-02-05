package EPAM_LECTURE_10.COFFEE_POINT.model.ingredients;

/**
 * Created by User on 04-Feb-18.
 */
public class Chocolate extends Ingredient {
    private double price = 2.00;
    private String name = "Milk";

    public Chocolate() {
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
