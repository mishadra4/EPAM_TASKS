package EPAM_LECTURE_3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Created by User on 27-Dec-17.
 */
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
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println();
//            System.out.println(i+1 + " train with " + "11" + " or more free places:");
//
//            for (TrainStation station: list.get(i).getStations()
//                    ) {
//                System.out.println(list.get(i).getVacantSeats() + " free places");
//                System.out.println(station.getNameOfStation());
//            }
//        }arrivalDate = LocalDate.of(1999, Month.FEBRUARY,30);
        //DayOfWeek dayOfWeek = DayOfWeek.of(7);
        //System.out.println(dayOfWeek);
        TrainManager trainManager = new TrainManager();
        trainManager.createTrainArray();

    }
}
