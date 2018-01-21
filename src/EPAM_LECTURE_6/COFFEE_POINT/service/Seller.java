package EPAM_LECTURE_6.COFFEE_POINT.service;


import EPAM_LECTURE_6.COFFEE_POINT.model.*;

import java.util.LinkedList;
import java.util.Scanner;

public class Seller {
    Scanner scanner = new Scanner(System.in);
    LinkedList<Product> products = new LinkedList<Product>();
    Seller(){
        System.out.println("Hello! What do you want to buy? We have in sale:");
        for (InventoryUnit inventoryUnit : ProductManager.getInventoryUnits()) {
            System.out.println(inventoryUnit.getProduct().getName());
        }
        takeOrder();
    }

    public void takeOrder(){
        BuyingManager buyingManager = new BuyingManager();
        System.out.println("If you want to buy coffee input 1, if anything else input 2");
        int type = scanner.nextInt();
        if(type == 1) {
            String coffeeType, coffeeBrand;
            int quantity;
            System.out.println("Input type of Coffee");
            coffeeType = scanner.nextLine();
            System.out.println("Input brand of Coffee");
            coffeeBrand = scanner.nextLine();
            quantity = scanner.nextInt();
            buy(coffeeType, coffeeBrand, quantity, buyingManager);
        }
        if(type == 2){
            String product = scanner.nextLine();
            int quantity = scanner.nextInt();
            buy(product, quantity, buyingManager);
        }
        System.out.println("Do you want something else?(Y/N)");
        if(scanner.nextLine().equals("Y")){
            takeOrder();
        }
        if(scanner.nextLine().equals("N")){
            checkout(buyingManager);
        }
    }

    public void buy(String coffeeType, String coffeeBrand, int quantity, BuyingManager buyingManager) {
        if (ProductManager.getProduct(coffeeBrand, quantity) == null) {
            return;
        }
        buyingManager.addToOrder(coffeeType, quantity);
        ICoffeeMachine coffeeMachine = CoffeeMachineFactory.getCoffeeMachine(coffeeBrand);
        products.add(coffeeMachine.makeCoffee(CoffeeType.valueOf(coffeeType)));
    }

    public void buy(String productName, int quantity, BuyingManager buyingManager) {
        Product product = ProductManager.getProduct(productName,quantity);
        if(product == null){
            return;
        }
        buyingManager.addToOrder(productName, quantity);
        products.add(product);
    }
     public LinkedList<Product> checkout(BuyingManager buyingManager){
         System.out.println("Input your full name");
         String fullName = scanner.nextLine();
         System.out.println("Input your payment type(Card/Cash/Bonuses)");
         String paymentType = scanner.nextLine();
         if(buyingManager.checkout(fullName,paymentType)) {
            return products;
         }else{
             System.out.println("You can`t pay with " + paymentType + " Do you want to change your payment type?(Y/N)");
             if(scanner.nextLine().equals("Y")) {
                 checkout(buyingManager);
             }else{
                 System.out.println("We can`t give you your order for free");
                 buyingManager=null;
             }
             return null;
         }
     }
}
