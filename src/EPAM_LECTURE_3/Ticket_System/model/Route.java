package EPAM_LECTURE_3.Ticket_System.model;

import java.util.LinkedList;

public class Route {
    private LinkedList<Station> stations;
    private int routeId;
    private Schedule schedule;

    public Route(LinkedList<Station> stations, int routeId, Schedule schedule) {
        this.stations = stations;
        this.routeId = routeId;
        this.schedule = schedule;
    }
}
