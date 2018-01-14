package EPAM_LECTURE_3.Ticket_System;


import EPAM_LECTURE_3.Ticket_System.service.TrainSystemManager;

public class Main {
    public static void main(String[] args) {
        TrainSystemManager trainSystemManager = new TrainSystemManager();
        trainSystemManager.generateRoute();
        trainSystemManager.buyTicket("Mykhajlo Drach", "Lviv", "Kyiv");
    }
}
