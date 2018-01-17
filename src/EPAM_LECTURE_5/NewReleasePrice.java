package EPAM_LECTURE_5;

/**
 * Created by User on 17-Jan-18.
 */
public class NewReleasePrice extends  Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
    double charge(int daysRented){
        return daysRented * 3;
    }
    int getFrequentRenterPoints(int daysRented){
        return (daysRented > 1) ? 2: 1;
    }
}
