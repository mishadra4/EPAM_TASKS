package EPAM_LECTURE_7.Pizza_cafe.model.Ingredients;

/**
 * Created by User on 22-Jan-18.
 */
public class Cheese extends Ingredient{
    private double price = 3.00;
    private String name = "Cheese";

    public Cheese(){
        super.setPrice(price);
        super.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

