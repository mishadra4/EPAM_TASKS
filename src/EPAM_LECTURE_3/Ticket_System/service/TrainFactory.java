package EPAM_LECTURE_3.Ticket_System.service;

import EPAM_LECTURE_3.Ticket_System.model.Schedule;
import EPAM_LECTURE_3.Ticket_System.model.Train;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class TrainFactory {
    private static LinkedList<Train> trainPool = new LinkedList<>();


    public static Train getTrain(Schedule schedule, LinkedList<DayOfWeek> daysOfWeeks) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of seats of the train!");
        int numberOfSeats = scanner.nextInt();
        LocalDate date = LocalDate.now();
        Train train = new Train(trainPool.size(), schedule, numberOfSeats, date);
        trainPool.add(train);
        return train;
    }

    public static LinkedList<Train> getTrainPool() {
        return trainPool;
    }
}
