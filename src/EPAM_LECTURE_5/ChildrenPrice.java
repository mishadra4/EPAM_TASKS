package EPAM_LECTURE_5;

/**
 * Created by User on 17-Jan-18.
 */
public class ChildrenPrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.CHILDREN;
    }
    double charge(int daysRented){
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
