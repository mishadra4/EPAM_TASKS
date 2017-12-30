package EPAM_LECTURE_3;

import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainManager {
    Scanner scanner = new Scanner(System.in);
    private List<Train> trains;

    public void createTrainArray(){
        trains = new ArrayList<>();
        System.out.println("To enter new train input 1, to end enter process input 0");
        int k = scanner.nextInt();
        while (k == 1) {
            trains.add(new Train());
            System.out.println("To enter new train input 1, to end enter process input 0");
            k = scanner.nextInt();
        }
    }
    List<Train> findTrainFromToLocation(TrainStation departureStation, TrainStation destination){
        List<Train> list = new ArrayList();
        for (int i = 0; i < trains.size(); i++) {
            boolean hasDepartureStation = false;
            boolean hasDestination = false;
            for (TrainStation station: trains.get(i).getStations() ) {
                if(station.getNameOfStation().equals(departureStation.getNameOfStation()) ){
                    hasDepartureStation = true;
                }
                if(station.getNameOfStation().equals(destination.getNameOfStation()) ){
                    hasDestination = true;
                }
            }
            if( hasDepartureStation == true && hasDestination == true ){
                list.add(trains.get(i));
            }
        }
        return list;
    }
    List<Train> findTrainAfterDate(LocalDateTime date){
        List<Train> list = new ArrayList();
        for (int i = 0; i < trains.size(); i++) {
            for (TrainStation station: trains.get(i).getStations() ) {
                if( trains.get(i).getDepartureTime() .plusHours(station.getDurationOfRoute().getHour())
                        .plusDays(station.getDurationOfRoute().getDayOfMonth()).plusMinutes
                                (station.getDurationOfRoute().getMinute()).isAfter(date)){
                    list.add(trains.get(i));
                }
            }
        }
        return list;
    }
    List<Train> findTrainWithFreePlace(TrainStation trainStation, int vacantSeats){
        List<Train> list = new ArrayList();
        for (int i = 0; i < trains.size(); i++) {
            if (trains.get(i).getVacantSeats() > vacantSeats) {
                for (TrainStation station : trains.get(i).getStations()) {
                    if (station.getNameOfStation().indexOf(trainStation.getNameOfStation()) != -1) {
                        list.add(trains.get(i));
                    }
                }
            }
        }
        return list;
    }
}
