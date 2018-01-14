package EPAM_LECTURE_3.Ticket_System.model;


import java.time.LocalDate;
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

    public LinkedList<Station> getStations() {
        return stations;
    }

    public void setStations(LinkedList<Station> stations) {
        this.stations = stations;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
}
