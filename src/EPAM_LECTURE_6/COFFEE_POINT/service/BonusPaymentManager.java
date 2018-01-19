package EPAM_LECTURE_6.COFFEE_POINT.service;

import EPAM_LECTURE_6.COFFEE_POINT.model.Client;

public class BonusPaymentManager implements IPaymentManager {
    @Override
    public boolean pay(Client client, double sum) {
        if(sum > client.getBonusBalance()) {
            return false;
        }
        client.setBonusBalance(client.getBonusBalance() - sum);
        return true;
    }
}
