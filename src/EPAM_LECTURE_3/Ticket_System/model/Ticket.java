package EPAM_LECTURE_3.Ticket_System.model;


public class Ticket {
    private Station departure;
    private Station destination;
    private int seatNumber;
    private String passengerName;

    public Ticket(Station departure, Station destination, int seatNumber, String passengerName) {
        this.departure = departure;
        this.destination = destination;
        this.seatNumber = seatNumber;
        this.passengerName = passengerName;
    }

}
