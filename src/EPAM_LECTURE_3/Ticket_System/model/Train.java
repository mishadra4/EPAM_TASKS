package EPAM_LECTURE_3.Ticket_System.model;


public class Train {
    private int TrainId;
    private Route route;
    private int seatsNumber;

    public Train(int trainId, Route route, int seatsNumber) {
        TrainId = trainId;
        this.route = route;
        this.seatsNumber = seatsNumber;
    }
}
