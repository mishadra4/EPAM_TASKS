package EPAM_LECTURE_7.Pizza_cafe.model.Ingredients;

/**
 * Created by User on 22-Jan-18.
 */
public class Mushroom extends Ingredient{
    private double price = 4.00;
    private String name = "Mushroom";

    public Mushroom(){
        super.setPrice(price);
        super.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

