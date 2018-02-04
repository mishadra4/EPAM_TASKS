package EPAM_LECTURE_10.COFFEE_POINT.service;


import EPAM_LECTURE_10.COFFEE_POINT.model.Client;
import EPAM_LECTURE_10.COFFEE_POINT.model.Order;
import EPAM_LECTURE_10.COFFEE_POINT.model.Product;

public class BuyingManager {
    private Order order = new Order();

    public void addToOrder(String name, int quantity){
        Product product = ProductManager.getProduct(name,quantity);
        if(product == null){
            return;
        }
        order.addProduct(product);
    }

    public boolean checkout(Order order, String clientFullName, String paymentType){
        Client client = ClientManager.getClient(clientFullName);
        if(paymentType.equals("Cash")){
            return new CashPaymentManager().pay(client,order.getSum());

        }
        if(paymentType.equals("Bonuses")){
            return new BonusPaymentManager().pay(client,order.getSum());
        }
        return false;
    }

}
