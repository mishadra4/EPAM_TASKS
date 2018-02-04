package EPAM_LECTURE_10.COFFEE_POINT.model;


import EPAM_LECTURE_10.COFFEE_POINT.service.ClientManager;

import java.util.LinkedList;
import java.util.List;

public class Client {
    private String fullName;
    private int ID;
    private double bonusBalance;
    private List<Order> orderHistory;

    public Client(){}

    public Client(String fullName) {
        orderHistory = new LinkedList<>();
        ID = ClientManager.getClients().size();
        this.fullName = fullName;
        this.bonusBalance = 0;
    }

    public int getID() {
        return ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBonusBalance() {
        return bonusBalance;
    }

    public void setBonusBalance(double bonusBalance) {
        this.bonusBalance = bonusBalance;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(List<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }
}
