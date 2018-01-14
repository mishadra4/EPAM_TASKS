package EPAM_LECTURE_3.Ticket_System.service;

import EPAM_LECTURE_3.Ticket_System.model.Station;
import EPAM_LECTURE_3.Ticket_System.model.Train;

public class TrainManager {
    public static Train getTrain(String departure, String destination) {
        for (Train train : TrainFactory.getTrainPool()) {
            int hasDeparture = -1, hasDestination = -1;
            for (int i = 0; i < train.getSchedule().getStations().size(); i++) {
                if (departure.equals(train.getSchedule().getStations().get(i).getNameOfStaion()) && train.getVacantSeatsByStations().get(i) > 0) {
                    hasDeparture = i;
                }
                if (destination.equals(train.getSchedule().getStations().get(i).getNameOfStaion()) && train.getVacantSeatsByStations().get(i) > 0) {
                    hasDestination = i;
                }
            }
            if (hasDeparture >= 0 && hasDestination >= 0 && hasDeparture < hasDestination){
                return train;
            }
        }
        return null;
    }
}
