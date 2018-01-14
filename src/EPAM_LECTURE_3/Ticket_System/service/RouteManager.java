package EPAM_LECTURE_3.Ticket_System.service;


import EPAM_LECTURE_3.Ticket_System.model.Route;

public class RouteManager {
    public static Route getRoute(String departure, String destination){
        return RouteFactory.getRoute();
    }
}
