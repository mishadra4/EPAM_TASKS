package EPAM_LECTURE_5;

import java.util.Enumeration;
import java.util.Vector;

class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }
    public double getCharge(){
        return this.getMovie().getMovieRental(getDaysRented());
    }
    public int getFrequentRentalPoints(){

        // add bonus for a two day new release rental
        return this.getMovie().getDaysRentalPoint(this.getDaysRented());
    }
    public static double getTotalFrequentRentalPoints(Vector _rentals){
        double frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // add frequent renter points
            frequentRenterPoints += each.getFrequentRentalPoints();
        }
        return frequentRenterPoints;
    }
    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }
}