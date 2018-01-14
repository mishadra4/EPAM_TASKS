package EPAM_LECTURE_3.Ticket_System.service;


import EPAM_LECTURE_3.Ticket_System.model.Route;
import EPAM_LECTURE_3.Ticket_System.model.Schedule;
import EPAM_LECTURE_3.Ticket_System.model.Station;

import java.time.DayOfWeek;
import java.util.LinkedList;
import java.util.Scanner;

public class RouteFactory {
    private static LinkedList<Route> routePool = new LinkedList<>();

    public static Route getRoute(){
        Scanner scanner = new Scanner(System.in);
        LinkedList<Station> stations = new LinkedList<>();
        LinkedList<DayOfWeek> daysOfWeeks = new LinkedList<>();

        System.out.println("Inputing of stations:");

        int i = 0;
        while(scanner.hasNextLine()){
            System.out.println("Input " + i++ + " station.");
            stations.add(StationFactory.getStation(scanner.nextLine()));
        }
        Schedule schedule = ScheduleManager.getSchedule(stations);

        Route route = new Route(stations,routePool.size(),schedule, TrainFactory.getTrain(schedule,daysOfWeeks));
        routePool.add(route);
        return route;
    }

    public static LinkedList<Route> getRoutePool() {
        return routePool;
    }
}
