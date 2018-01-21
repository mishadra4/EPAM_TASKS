package EPAM_LECTURE_6.COFFEE_POINT;


import EPAM_LECTURE_6.COFFEE_POINT.model.CoffeeType;
import EPAM_LECTURE_6.COFFEE_POINT.model.Product;
import EPAM_LECTURE_6.COFFEE_POINT.service.ProductManager;
import EPAM_LECTURE_6.COFFEE_POINT.service.Seller;

public class Main {
    public static void main(String[] args) {
        ProductManager.addNewInventoryUnit(CoffeeType.AMERICANO.toString(),15.00,3);
        ProductManager.addNewInventoryUnit(CoffeeType.BLACK_COFFEE.toString(),10.00,4);
        ProductManager.addNewInventoryUnit(CoffeeType.MOKIATO.toString(),20.00,4);
        Seller seller = new Seller();
    }
}
