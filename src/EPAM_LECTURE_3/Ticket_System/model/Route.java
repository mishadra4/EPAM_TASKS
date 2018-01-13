package EPAM_LECTURE_3.Ticket_System.model;

import EPAM_LECTURE_3.Ticket_System.service.TrainManager;

import java.util.LinkedList;

public class Route {
    private LinkedList<Station> stations;
    private int routeId;
    private Schedule schedule;
    private Train train;

    public Route(LinkedList<Station> stations, int routeId, Schedule schedule, Train train) {
        this.stations = stations;
        this.routeId = routeId;
        this.schedule = schedule;
        this.train = train;
    }
}
