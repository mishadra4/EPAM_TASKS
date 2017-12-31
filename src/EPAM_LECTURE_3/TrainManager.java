package EPAM_LECTURE_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TrainManager {
    Scanner scanner = new Scanner(System.in);
    private List<Train> routes;
    private List<Train> trains;

    public void createRouteArray(){//this method creates routes array
        routes = new ArrayList<>();
        System.out.println("To enter new route input 1, to end enter process input 0");
        int k = scanner.nextInt();
        while (k == 1) {
                routes.add(new Train());
            System.out.println("To enter new route input 1, to end enter process input 0");
            k = scanner.nextInt();
        }
    }

    List<Train> findTrainFromToLocation(String departureStation, String destination){ //this method finds trains which goes from "departureStation" to "destination"
        List<Train> list = new ArrayList();
        for (int i = 0; i < trains.size(); i++) {
            boolean hasDepartureStation = false;
            boolean hasDestination = false;
            for (TrainStation station: trains.get(i).getStations() ) {
                if(station.getNameOfStation().equals(departureStation) ){
                    hasDepartureStation = true;
                }
                if(station.getNameOfStation().equals(destination) ){
                    hasDestination = true;
                }
            }
            if( hasDepartureStation == true && hasDestination == true ){
                list.add(trains.get(i));
            }
        }
        return list;
    }

    List<Train> findTrainAfterDate(String date){    //this method finds train which goes after date which is a parameter of our method
        List<Train> list = new ArrayList();
        LocalDateTime localDate = LocalDateTime.parse(date);

        for (int i = 0; i < trains.size(); i++) {
            for (TrainStation station: trains.get(i).getStations() ) {
                if( trains.get(i).getDepartureTime().plusHours(station.getDurationOfRoute().getHour())
                        .plusMinutes(station.getDurationOfRoute().getMinute()).isAfter(localDate)){
                    list.add(trains.get(i));
                    break;
                }
            }
        }
        return list;
    }

    List<Train> findTrainByNameOfStationWithFreePlace(String nameOfStation){//this method finds trains with free place and which goes to station
        List<Train> list = new ArrayList();
        for (int i = 0; i < trains.size(); i++) {
            if (trains.get(i).getVacantSeats() > 0) {
                for (TrainStation station : trains.get(i).getStations()) {
                    if (station.getNameOfStation().indexOf(nameOfStation) != -1) {
                        list.add(trains.get(i));
                        break;
                    }
                }
            }
        }
        return list;
    }

    void generateTrainsForAWeek(){//this method generates trains which goes by routes
        trains = new LinkedList<>();

        for (Train route: routes) {
            DayOfWeek dayOfWeek = LocalDateTime.now().getDayOfWeek();
            LocalDateTime date = LocalDateTime.now();
            for (int i = 0; i < 7; i++) {
                if(route.getDaysOfMonth() == 2){
                    for (DayOfWeek day : route.getDaysOfWeek()) {
                        if(day.equals(dayOfWeek)){
                            route.setDepartureTime(LocalDateTime.of(date.getYear(),date.getMonth(), date.getDayOfMonth(),
                                    route.getStations().get(0).getDurationOfRoute().getHour(), route.getStations().get(0).getDurationOfRoute().getMinute()));
                            trains.add(route);
                            break;
                        }
                    }
                }
                if(route.getDaysOfMonth() != 2){
                    if(route.getDaysOfMonth() == date.getDayOfMonth() % 2){
                        for (DayOfWeek day : route.getDaysOfWeek()) {
                            if(day.equals(dayOfWeek)){
                                route.setDepartureTime(LocalDateTime.of(date.getYear(),date.getMonth(), date.getDayOfMonth(),
                                        route.getStations().get(0).getDurationOfRoute().getHour(), route.getStations().get(0).getDurationOfRoute().getMinute()));
                                trains.add(route);
                                break;
                            }
                        }
                    }
                }
                date = date.plusDays(1);
                dayOfWeek = dayOfWeek.plus(1);
            }

        }
    }
}
