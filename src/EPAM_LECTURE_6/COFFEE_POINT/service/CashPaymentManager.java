package EPAM_LECTURE_6.COFFEE_POINT.service;


import EPAM_LECTURE_6.COFFEE_POINT.model.Client;

public class CashPaymentManager implements IPaymentManager {
    @Override
    public boolean pay(Client client, double sum) {
        client.setBonusBalance(client.getBonusBalance() + sum/10.0);
        return true;
    }
}
