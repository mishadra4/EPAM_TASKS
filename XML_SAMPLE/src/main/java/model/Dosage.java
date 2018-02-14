package model;


public class Dosage {
    private double dose;
    private String period;

    public Dosage(double dose, String period) {
        this.dose = dose;
        this.period = period;
    }

    public Dosage() {
    }

    public double getDose() {
        return dose;
    }

    public void setDose(double dose) {
        this.dose = dose;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
