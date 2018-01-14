package EPAM_LECTURE_3.Ticket_System.model;


import java.time.LocalDate;
import java.util.LinkedList;

public class Train {
    private int trainId;
    private Schedule schedule;
    private int seatsNumber;
    private LocalDate date;
    private LinkedList<Integer> vacantSeatsByStations = new LinkedList<>();


    public Train(int trainId, Schedule schedule, int seatsNumber, LocalDate date) {
        for (int i = 0; i < schedule.getStations().size(); i++) {
            vacantSeatsByStations.add(seatsNumber);
        }
        this.trainId = trainId;
        this.schedule = schedule;
        this.seatsNumber = seatsNumber;
        this.date = date;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LinkedList<Integer> getVacantSeatsByStations() {
        return vacantSeatsByStations;
    }

    public void setVacantSeatsByStations(LinkedList<Integer> vacantSeatsByStations) {
        this.vacantSeatsByStations = vacantSeatsByStations;
    }
}
