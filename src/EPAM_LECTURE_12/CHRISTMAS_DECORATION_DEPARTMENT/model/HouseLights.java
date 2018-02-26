package EPAM_LECTURE_12.CHRISTMAS_DECORATION_DEPARTMENT.model;

public class HouseLights extends HouseDecoration {
    public HouseLights(Double price) {
        super("House lights", price);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(Double price) {
        super.setPrice(price);
    }

    @Override
    public DecorationType getDecorationType() {
        return super.getDecorationType();
    }

    @Override
    public void setDecorationType(DecorationType decorationType) {
        super.setDecorationType(decorationType);
    }
}
