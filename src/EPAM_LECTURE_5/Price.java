package EPAM_LECTURE_5;

/**
 * Created by User on 17-Jan-18.
 */
public abstract class Price {
    public abstract int getPriceCode();
    double getCharge(int daysRented) {

        double result = 0;

        switch (getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += daysRented * 3;
                break;
            case Movie.CHILDREN:
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }
    int getFrequentRenterPoints(int daysRented){
        return 1;
    }
}
