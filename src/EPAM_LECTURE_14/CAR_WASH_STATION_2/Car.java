package EPAM_LECTURE_14.CAR_WASH_STATION_2;


class Car {
    public enum Status { DIRTY, FOAMED, WASHED }
    private Status status = Status.DIRTY;
    public Car() {}
    public void foam() { status = Status.FOAMED; }
    public void wash() { status = Status.WASHED; }
    public Status getStatus() { return status; }
    public String toString() {
        return "Car " + status;
    }
}
