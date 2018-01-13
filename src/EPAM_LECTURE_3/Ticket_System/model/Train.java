package EPAM_LECTURE_3.Ticket_System.model;


public class Train {
    private int TrainId;
    private Schedule schedule;
    private int seatsNumber;

    public Train(int trainId,Schedule schedule, int seatsNumber) {
        TrainId = trainId;
        this.schedule = schedule;
        this.seatsNumber = seatsNumber;
    }
}
