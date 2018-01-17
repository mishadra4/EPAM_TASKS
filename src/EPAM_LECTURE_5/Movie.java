package EPAM_LECTURE_5;;import EPAM_LECTURE_5.ChildrenPrice;
import EPAM_LECTURE_5.NewReleasePrice;
import EPAM_LECTURE_5.Price;
import EPAM_LECTURE_5.RegularPrice;

public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private int _priceCode;
    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }
    public double getMovieRental(int daysRented){
        double result = 0;
        switch (this.getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += (daysRented * 3);
                break;
            case Movie.CHILDREN:
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }

    public int getDaysRentalPoint(double daysRented){
        if ((this.getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
            return 2;
        return 1;
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    int getFrequentRenterPoints(int daysRented){
        return _price.getFrequentRenterPoints(daysRented);
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case Movie.REGULAR:
                _price = new RegularPrice();
                break;
            case Movie.CHILDREN:
                _price = new ChildrenPrice();
                break;
            case Movie.NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public String getTitle() {
        return _title;
    }
    public double getCharge(int daysRented){
        return _price.getCharge(daysRented);
    }
    public Price getPrice() {
        return _price;
    }

    public void set_price(Price _price) {
        this._price = _price;
    }
}