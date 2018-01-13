package EPAM_LECTURE_3.Ticket_System.service;

import EPAM_LECTURE_3.Ticket_System.model.Train;

import java.util.LinkedList;
import java.util.Scanner;

public class TrainManager {
    private static LinkedList<Train> trainPool = new LinkedList<>();

    public static Train getTrain(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of seats of the train!");
        int numberOfSeats = scanner.nextInt();
        Train train = new Train(trainPool.size(), RouteFactory.getRoute(),numberOfSeats);
        trainPool.add(train);
        return train;
    }
}
