package EPAM_LECTURE_3.Ticket_System.model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.util.LinkedList;

public class Schedule {
    private LinkedList<Station> stations;
    private Duration duration = Duration.ZERO;
    private LocalDateTime departureTime;
    private LinkedList<MonthDay> monthDays;

    public Schedule(LinkedList<Station> stations, Duration duration, LocalDateTime departureTime, LinkedList<MonthDay> monthDays) {
        this.stations = stations;
        this.duration = duration;
        this.departureTime = departureTime;
        this.monthDays = monthDays;
    }
}
