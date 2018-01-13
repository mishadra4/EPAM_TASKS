package EPAM_LECTURE_3.Ticket_System.service;


import EPAM_LECTURE_3.Ticket_System.model.Route;
import EPAM_LECTURE_3.Ticket_System.model.Station;

import java.util.LinkedList;
import java.util.Scanner;

public class RouteFactory {
    private static LinkedList<Route> routePool = new LinkedList<>();

    public static Route getRoute(){
        Scanner scanner = new Scanner(System.in);
        LinkedList<Station> stations = new LinkedList<>();

        System.out.println("Inputing of stations:");

        int i = 0;
        while(scanner.hasNextLine()){
            System.out.println("Input " + i++ + " station.");
            stations.add(StationFactory.getStation(scanner.nextLine()));
        }

        Route route = new Route(stations,routePool.size(),ScheduleManager.getSchedule());
        routePool.add(route);
        return route;
    }
}
