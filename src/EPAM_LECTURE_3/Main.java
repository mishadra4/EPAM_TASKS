package EPAM_LECTURE_3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        TrainManager trainManager = new TrainManager();
//        List<Train> list;
//        trainManager.createTrainArray();
//        list = trainManager.findTrainFromToLocation(new TrainStation("Kovel"), new TrainStation("Uzhgorod"));
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println();
//            System.out.println(i+1 + " train");
//            System.out.println(list.get(i).getVacantSeats() + " free places");
//            for (TrainStation station: list.get(i).getStations()
//                    ) {
//                System.out.println(station.getNameOfStation());
//            }
//        }
//        list = trainManager.findTrainWithFreePlace(new TrainStation("Kovel"), 11);
//
//
//            for (TrainStation station: list.get(i).getStations()
//                    ) {
//                System.out.println(list.get(i).getVacantSeats() + " free places");
//                System.out.println(station.getNameOfStation());
//            }
//        }arrivalDate = LocalDate.of(1999, Month.FEBRUARY,30);
        //DayOfWeek dayOfWeek = DayOfWeek.of(7);
        //System.out.println(dayOfWeek);
        List<Train> trainList;
        TrainManager trainManager = new TrainManager();
        trainManager.createTrainArray();
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
        trainList = trainManager.findTrainFromToLocation("Lviv", "Kovel");
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
        trainList.get(0).buyTicket("Lviv", "Kovel");
        for (int i = 0; i < trainList.size(); i++){
            System.out.println();
            System.out.println(i+1 + " train");
            for (TrainStation station : trainList.get(i).getStations()) {
                System.out.println(trainList.get(i).getVacantSeats() + " free places");
                System.out.println(station.getNameOfStation());
            }
        }
    }
}
