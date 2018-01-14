package EPAM_LECTURE_3.Ticket_System.service;

import EPAM_LECTURE_3.Ticket_System.model.Schedule;
import EPAM_LECTURE_3.Ticket_System.model.Station;

import java.time.*;
import java.util.LinkedList;
import java.util.Scanner;

public class ScheduleManager {
    public static Schedule getSchedule(LinkedList<Station> stations){
        Scanner scanner = new Scanner(System.in);
        LinkedList<Duration>  durations = new LinkedList<>();
        Duration totalDuration = Duration.ZERO;
        LocalTime departureTime;

        System.out.println("Input Departure time(format: hh:mm):");
        departureTime = LocalTime.parse(scanner.nextLine());
        for (int i = 0; i < stations.size() -1; i++) {
            System.out.println("Input time of way(in minutes) from station: "
                    +stations.get(i).getNameOfStaion() + " to station: " + stations.get(i+1).getNameOfStaion() );
            int time = scanner.nextInt();
            durations.add(i,Duration.ofMinutes(time));
            totalDuration.plusMinutes(time);
        }

        return new Schedule(stations, totalDuration, departureTime);
    }
}
