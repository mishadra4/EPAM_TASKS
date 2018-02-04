package EPAM_LECTURE_7.Pizza_cafe.model;

import EPAM_LECTURE_7.Pizza_cafe.model.Ingredients.Dough;
import EPAM_LECTURE_7.Pizza_cafe.model.Ingredients.Ingredient;
import EPAM_LECTURE_7.Pizza_cafe.model.Ingredients.Ketchup;

import java.util.LinkedList;
import java.util.List;

public class Pizza extends Product{
    List<Ingredient> ingredients = new LinkedList<Ingredient>();
    private String name = "Pizza ";
    private double price;

    Pizza(){
        Dough dough = new Dough();
        Ketchup ketchup = new Ketchup();
        ingredients.add(dough);
        ingredients.add(ketchup);
        name += dough;
        name += ketchup;
        super.setPrice(price);
        super.setName(name);
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
