package EPAM_LECTURE_7.Pizza_cafe.model.Ingredients;

/**
 * Created by User on 22-Jan-18.
 */
public class Ham extends Ingredient{
    private double price = 5.00;
    private String name = "Ham";

    public Ham(){
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

