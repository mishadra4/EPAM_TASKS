package EPAM_LECTURE_3.Ticket_System.service;


public class TrainSystemManager {
    public void generateRoute(){
        RouteFactory.getRoute();
    }
    public void getRoutePool(){
        RouteFactory.getRoutePool();
    }
    public void buyTicket(String passengerName, String department, String destination){
        TicketManager.buyTicket(passengerName, department, destination);
    }


}
