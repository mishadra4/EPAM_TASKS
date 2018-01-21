package EPAM_LECTURE_6.COFFEE_POINT.model;

public class Product {
    private String name;
    private double price;

    public Product(){}

    public Product(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}