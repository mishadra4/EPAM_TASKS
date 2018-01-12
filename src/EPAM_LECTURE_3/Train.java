package EPAM_LECTURE_3;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Train {
    Scanner scanner = new Scanner(System.in);
    private List<TrainStation> stations = new ArrayList();
    private int vacantSeats;
    private LocalDateTime departureTime;
    private DayOfWeek [] daysOfWeek = new DayOfWeek[7];
    private int daysOfMonth;

    Train(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Input number of vacant seats:");
        vacantSeats = scanner.nextInt();
        while(vacantSeats < 0){
            System.out.println("You enter wrong number of vacant seats. Please try again.");
            vacantSeats = scanner.nextInt();
        }
        int k, n = 0;

        String nameOfStation;
        while(true){
            System.out.println("If you want to add new station input 1, to end input 0");
            k = scanner.nextInt();
            if(k == 0){
                break;
            }
            System.out.println("Input name of station");
            scanner.nextLine();
            nameOfStation = scanner.nextLine();
            TrainStation station = new TrainStation();
            System.out.println("Input date of arriving(format: hh:mm)");
            LocalTime durationOfRoute = LocalTime.parse(scanner.nextLine(), formatter);
            System.out.println("Input time of stop(in minutes)");
            LocalTime timeOfStop = LocalTime.parse("00:" + scanner.nextInt());
            station.setDurationOfRoute(durationOfRoute);
            station.setTimeOfStop(timeOfStop);
            station.setNameOfStation(nameOfStation);
            station.setVacantSeats(vacantSeats);
            stations.add(station);
            n++;
        }
        if(n < 2){
            System.out.println("This train goes anywhere. You enter " + n + " station!");
        }
        System.out.println("Enter days of week when the train go by route(1-Mon, 2-Tue...), to end entering input 0");
        for(int i = 0; ; i++){
            k = scanner.nextInt();
            if(k == 0) {
                break;
            }
            if(k < 1 || k > 7){
                System.out.println("You enter wrong day of week. Try again!");
            }
            daysOfWeek[i] = DayOfWeek.of(k);
        }
        System.out.println("Choose the right expression: " +
                "\n0. The train goes only in paired days of month." +
                "\n1. The train goes only in odd days of month." +
                "\n2. The train goes every day of month.");
        daysOfMonth = scanner.nextInt();
    }

    boolean buyTicket(String departureStation, String destination){
            boolean hasDepartureStation = false;
            for (TrainStation station: this.stations ) {
                if(hasDepartureStation){
                    station.setVacantSeats(station.getVacantSeats() - 1 );
                }
                if(station.getNameOfStation().equals(departureStation) ){
                    station.setVacantSeats(station.getVacantSeats() - 1 );
                    hasDepartureStation = true;
                }
                if(station.getNameOfStation().equals(destination) ){
                    station.setVacantSeats(station.getVacantSeats() - 1 );
                    return true;
                }
            }
            return false;
        }

    public List<TrainStation> getStations() {
        return stations;
    }

    public void setStations(List<TrainStation> stations) {
        this.stations = stations;
    }

    public int getVacantSeats() {
        return vacantSeats;
    }

    public void setVacantSeats(int vacantSeats) {
        this.vacantSeats = vacantSeats;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }
    public DayOfWeek[] getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(DayOfWeek[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public int getDaysOfMonth() {
        return daysOfMonth;
    }

    public void setDaysOfMonth(int daysOfMonth) {
        this.daysOfMonth = daysOfMonth;
    }
}
