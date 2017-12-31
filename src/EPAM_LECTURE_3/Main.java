package EPAM_LECTURE_3;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Train> trainList;
        TrainManager trainManager = new TrainManager();
        trainManager.createRouteArray();
        trainManager.generateTrainsForAWeek();
        trainList = trainManager.findTrainByNameOfStationWithFreePlace("K");
        for (int i = 0; i < trainList.size(); i++) {
            System.out.println();
            System.out.println(i+1 + " train");
            for (TrainStation station : trainList.get(i).getStations()) {
                System.out.println(trainList.get(i).getVacantSeats() + " free places");
                System.out.println(station.getNameOfStation());
            }
        }
        trainList = trainManager.findTrainFromToLocation("Lviv", "Kremenchug");
        System.out.println();
        System.out.println();
        for (int i = 0; i < trainList.size(); i++) {
            System.out.println();
            System.out.println();
            System.out.println(i+1 + " train");
            for (TrainStation station : trainList.get(i).getStations()) {
                System.out.println(trainList.get(i).getVacantSeats() + " free places");
                System.out.println(station.getNameOfStation());
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        trainList.get(0).buyTicket("Lviv", "Kremenchug");
        System.out.println();
        System.out.println(0+1 + " train");
        for (TrainStation station : trainList.get(0).getStations()) {
            System.out.println(trainList.get(0).getVacantSeats() + " free places");
            System.out.println(station.getNameOfStation());
        }
        System.out.println("Trains after date");
        List<Train> trainList2 = trainManager.findTrainAfterDate("2018-01-05T10:00");
        for (int i = 0; i < trainList2.size(); i++){
            System.out.println(i+1 + " train");
            for (TrainStation station : trainList.get(i).getStations()) {
                System.out.println(trainList.get(i).getVacantSeats() + " free places");
                System.out.println(station.getNameOfStation());
            }
        }
    }
}
