package EPAM_LECTURE_3.Ticket_System.service;


import EPAM_LECTURE_3.Ticket_System.model.Station;

import java.util.LinkedList;

public class StationFactory {
    private static LinkedList<Station> stationPool = new LinkedList<>();
    public static Station getStation(String nameOfStation){
        for (Station station: stationPool) {
            if(station.getNameOfStaion().equals(nameOfStation)){
                return station;
            }
        }
        Station station = new Station(nameOfStation);
        stationPool.add(station);
        return station;
    }
}
