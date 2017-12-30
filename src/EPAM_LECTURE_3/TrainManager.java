package EPAM_LECTURE_3;

import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainManager {
    Scanner scanner = new Scanner(System.in);
    private List<Train> routes;
    private List<Train> trains;

    public void createTrainArray(){
        routes = new ArrayList<>();
        System.out.println("To enter new train input 1, to end enter process input 0");
        int k = scanner.nextInt();
        while (k == 1) {
            routes.add(new Train());
            System.out.println("To enter new train input 1, to end enter process input 0");
            k = scanner.nextInt();
        }
    }

    List<Train> findTrainFromToLocation(String departureStation, String destination){
        List<Train> list = new ArrayList();
        for (int i = 0; i < routes.size(); i++) {
            boolean hasDepartureStation = false;
            boolean hasDestination = false;
            for (TrainStation station: routes.get(i).getStations() ) {
                if(station.getNameOfStation().equals(departureStation) ){
                    hasDepartureStation = true;
                }
                if(station.getNameOfStation().equals(destination) ){
                    hasDestination = true;
                }
            }
            if( hasDepartureStation == true && hasDestination == true ){
                list.add(routes.get(i));
            }
        }
        return list;
    }

    List<Train> findTrainAfterDate(String date){
        List<Train> list = new ArrayList();
        LocalDateTime localDateTime = LocalDateTime.parse(date);
        for (int i = 0; i < routes.size(); i++) {
            for (TrainStation station: routes.get(i).getStations() ) {
                if( routes.get(i).getDepartureTime() .plusHours(station.getDurationOfRoute().getHour())
                        .plusMinutes(station.getDurationOfRoute().getMinute()).isAfter(localDateTime)){
                    list.add(routes.get(i));
                }
            }
        }
        return list;
    }

    List<Train> findTrainByNameOfStationWithFreePlace(String nameOfStation){
        List<Train> list = new ArrayList();
        for (int i = 0; i < routes.size(); i++) {
            if (routes.get(i).getVacantSeats() > 0) {
                for (TrainStation station : routes.get(i).getStations()) {
                    if (station.getNameOfStation().indexOf(nameOfStation) != -1) {
                        list.add(routes.get(i));
                    }
                }
            }
        }
        return list;
    }

    void generateTrainsForAWeek(){

        for (Train train: routes) {
            DayOfWeek dayOfWeek = LocalDateTime.now().getDayOfWeek();
            LocalDateTime date = LocalDateTime.now();
            for (int i = 0; i < 7; i++) {
                if(train.getDaysOfMonth() != 2){
                    if(train.getDaysOfMonth() == date.getDayOfMonth() % 2){
                        for (DayOfWeek day : train.getDaysOfWeek()) {
                            if(day.equals(dayOfWeek)){
                                trains.add(train);
                            }
                        }

                    }
                }
                date.plusDays(1);
                dayOfWeek.plus(1);
            }

        }
    }
}
