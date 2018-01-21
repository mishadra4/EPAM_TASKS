package EPAM_LECTURE_6.COFFEE_POINT.service;

import EPAM_LECTURE_6.COFFEE_POINT.model.InventoryUnit;
import EPAM_LECTURE_6.COFFEE_POINT.model.Product;

import java.util.LinkedList;

public class ProductManager {
    private static LinkedList<InventoryUnit> inventoryUnits = new LinkedList<>();

    public static void addNewInventoryUnit(String name, double price, Integer quantity){
        inventoryUnits.add(new InventoryUnit(new Product(name, price), quantity));
    }

    public static Product getProduct(String name, int quantity){
        for (InventoryUnit inventoryUnit: inventoryUnits) {
            if(inventoryUnit.getProduct().getName().equals(name) && inventoryUnit.getQuantity() >= quantity){
                inventoryUnit.setQuantity(inventoryUnit.getQuantity() - quantity);
                return inventoryUnit.getProduct();
            }
        }
        System.out.println("Unsufficient amount of " + name);
        return null;
    }

    public static LinkedList<InventoryUnit> getInventoryUnits() {
        return inventoryUnits;
    }

    public static void setInventoryUnits(LinkedList<InventoryUnit> inventoryUnits) {
        ProductManager.inventoryUnits = inventoryUnits;
    }
}
