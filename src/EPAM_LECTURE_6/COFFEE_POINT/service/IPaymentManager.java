package EPAM_LECTURE_6.COFFEE_POINT.service;

import EPAM_LECTURE_6.COFFEE_POINT.model.Client;

public interface IPaymentManager {
    boolean pay(Client client, double sum);
}
