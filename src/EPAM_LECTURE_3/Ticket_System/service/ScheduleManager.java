package EPAM_LECTURE_3.Ticket_System.service;

import EPAM_LECTURE_3.Ticket_System.model.Schedule;
import EPAM_LECTURE_3.Ticket_System.model.Station;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.util.LinkedList;

public class ScheduleManager {
    public static Schedule getSchedule(LinkedList<Station> stations){
        Duration duration = Duration.ZERO;
        LocalDateTime departureTime = LocalDateTime.now();
        LinkedList<MonthDay> monthDays = new LinkedList<>();
        return new Schedule(stations, duration, departureTime, monthDays);
    }
}
