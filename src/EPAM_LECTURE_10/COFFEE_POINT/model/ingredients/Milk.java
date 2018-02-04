package EPAM_LECTURE_10.COFFEE_POINT.model.ingredients;

/**
 * Created by User on 04-Feb-18.
 */
public class Milk extends Ingredient{

    public Milk(String name, double price) {
        super(name,price);
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
