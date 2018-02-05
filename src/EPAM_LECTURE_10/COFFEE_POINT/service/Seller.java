package EPAM_LECTURE_10.COFFEE_POINT.service;


import EPAM_LECTURE_10.COFFEE_POINT.model.InventoryUnit;
import EPAM_LECTURE_10.COFFEE_POINT.model.Product;

import java.util.LinkedList;
import java.util.Scanner;

public class Seller {
    Scanner scanner = new Scanner(System.in);
    LinkedList<Product> products = new LinkedList<Product>();
    public Seller(){
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
        scanner.nextLine();
        if(type == 1) {
            String coffeeType, coffeeBrand;
            int quantity;
            System.out.println("Input type of Coffee");
            coffeeType = scanner.nextLine();
            System.out.println("Input brand of Coffee");
            coffeeBrand = scanner.nextLine();
            System.out.println("Input quantity of " + coffeeType);
            quantity = scanner.nextInt();
            buy(coffeeType, coffeeBrand, quantity, buyingManager);
        }
        if(type == 2){
            String product = scanner.nextLine();
            int quantity = scanner.nextInt();
            buy(product, quantity, buyingManager);
        }
        System.out.println("Do you want something else?(Yes/No)");
        scanner.nextLine();
        String valString = scanner.nextLine();
        if(valString.equals("Yes")){
            takeOrder();
        }
        if(valString.equals("No")){
            if(products.isEmpty()){
                System.out.println("Thanks for coming!");{
                    return;
                }
            }
            checkout(buyingManager);
        }
    }
    public void takeOrder(BuyingManager buyingManager){
        System.out.println("If you want to buy coffee input 1, if anything else input 2");
        int type = scanner.nextInt();
        scanner.nextLine();
        if(type == 1) {
            String coffeeType, coffeeBrand;
            int quantity;
            System.out.println("Input type of Coffee");
            coffeeType = scanner.nextLine();
            System.out.println("Input brand of Coffee");
            coffeeBrand = scanner.nextLine();
            System.out.println("Input quantity of " + coffeeType);
            quantity = scanner.nextInt();
            buy(coffeeType, coffeeBrand, quantity, buyingManager);
        }
        if(type == 2){
            String product = scanner.nextLine();
            int quantity = scanner.nextInt();
            buy(product, quantity, buyingManager);
        }
        System.out.println("Do you want something else?(Yes/No)");
        scanner.nextLine();
        String valString = scanner.nextLine();
        if(valString.equals("Yes")){
            takeOrder(buyingManager);
        }
        if(valString.equals("No")){
            if(products.isEmpty()){
                System.out.println("Thanks for coming!");{
                    return;
                }
            }
            checkout(buyingManager);
        }
    }

   /**/ public void buy(String coffeeType, String coffeeBrand, int quantity, BuyingManager buyingManager) {
        buyingManager.addToOrder(coffeeType, quantity);

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
         System.out.println("You need to pay " + buyingManager.getOrder().getSum());
         System.out.println("Input your full name");
         String fullName = scanner.nextLine();
         System.out.println("Input your payment type(Card/Cash/Bonuses)");
         String paymentType = scanner.nextLine();
         if(buyingManager.checkout(fullName,paymentType)) {
            return products;
         }else{
             System.out.println("You can`t pay with " + paymentType + " Do you want to change your payment type?(Y/N)");
             scanner.nextLine();
             String valString = scanner.nextLine();
             if(valString.equals("Y")) {
                 checkout(buyingManager);
             }else{
                 System.out.println("We can`t give you your order for free");
                 buyingManager=null;
             }
             return null;
         }
     }
}
