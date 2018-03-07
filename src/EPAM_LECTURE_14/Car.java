package EPAM_LECTURE_14;


class Car {
    public enum Status { DRY, FOAMED, WASHED }
    private Status status = Status.DRY;
    private final int id;
    public Car(int idn) { id = idn; }
    public void foam() { status = Status.FOAMED; }
    public void wash() { status = Status.WASHED; }
    public Status getStatus() { return status; }
    public int getId() { return id; }
    public String toString() {
        return "Car " + id + ": " + status;
    }
}
