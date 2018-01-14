package EPAM_LECTURE_3.Ticket_System.model;


public class Ticket {
    private String departure;
    private String destination;
    private int seatNumber;
    private String passengerName;

    public Ticket(String departure, String destination, int seatNumber, String passengerName) {
        this.departure = departure;
        this.destination = destination;
        this.seatNumber = seatNumber;
        this.passengerName = passengerName;
    }

}
