package EPAM_LECTURE_10.COFFEE_POINT.model;

public class Coffee extends Product {
    private double price = 6.00;
    private String name = "Coffee";
    public Coffee(){
        super.setName(name);
        super.setPrice(price);
    }
}
