package EPAM_LECTURE_3.Ticket_System.service;


import EPAM_LECTURE_3.Ticket_System.model.Route;
import EPAM_LECTURE_3.Ticket_System.model.Station;
import EPAM_LECTURE_3.Ticket_System.model.Ticket;
import EPAM_LECTURE_3.Ticket_System.model.Train;

import java.util.LinkedList;

public class TicketManager {


    Ticket buyTicket(String passengerName, String departure, String destination){
        Train train = TrainManager.getTrain(departure,destination);
        int destinationId = 0, departureId = 0;
        for (int i = 0; i < train.getSchedule().getStations().size(); i++) {
            if(departure.equals(train.getSchedule().getStations().get(i).getNameOfStaion())){
                departureId = i;
            }
            if(destination.equals(train.getSchedule().getStations().get(i).getNameOfStaion())){
                destinationId = i;
            }
        }
        for (int i = departureId; i < destinationId; i++) {
            train.getVacantSeatsByStations().set(i,train.getVacantSeatsByStations().get(i));
        }
        Ticket ticket = new Ticket(departure,destination, 0,passengerName);
        return ticket;
    }
}
