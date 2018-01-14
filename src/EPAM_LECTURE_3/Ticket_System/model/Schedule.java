package EPAM_LECTURE_3.Ticket_System.model;

import java.time.Duration;
import java.time.LocalTime;
import java.time.MonthDay;
import java.util.LinkedList;

public class Schedule {
    private LinkedList<Station> stations;
    private Duration duration = Duration.ZERO;
    private LocalTime departureTime;

    public Schedule(LinkedList<Station> stations, Duration duration, LocalTime departureTime) {
        this.stations = stations;
        this.duration = duration;
        this.departureTime = departureTime;
    }

    public LinkedList<Station> getStations() {
        return stations;
    }

    public void setStations(LinkedList<Station> stations) {
        this.stations = stations;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }
}
