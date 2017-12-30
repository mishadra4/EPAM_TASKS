package EPAM_LECTURE_3;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TrainStation {
    private LocalTime durationOfRoute;
    private LocalTime timeOfStop;
    private String nameOfStation;
    private int vacantSeats;

    TrainStation(){}

    TrainStation(LocalTime duration, LocalTime timeOfStop, String nameOfStation, int vacantSeats){
        this.durationOfRoute = duration;
        this.timeOfStop = timeOfStop;
        this.nameOfStation = nameOfStation;
        this.vacantSeats = vacantSeats;

    }

    TrainStation(String nameOfStation){
        this.nameOfStation = nameOfStation;
    }
    public int getVacantSeats() {
        return vacantSeats;
    }

    public void setVacantSeats(int vacantSeats) {
        this.vacantSeats = vacantSeats;
    }
    public LocalTime getDurationOfRoute() {
        return durationOfRoute;
    }

    public void setDurationOfRoute(LocalTime durationOfRoute) {
        this.durationOfRoute = durationOfRoute;
    }

    public LocalTime getTimeOfStop() {
        return timeOfStop;
    }

    public void setTimeOfStop(LocalTime timeOfStop) {
        this.timeOfStop = timeOfStop;
    }

    public String getNameOfStation() {
        return nameOfStation;
    }

    public void setNameOfStation(String nameOfStation) {
        this.nameOfStation = nameOfStation;
    }
}
