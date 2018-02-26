package EPAM_LECTURE_12.CHRISTMAS_DECORATION_DEPARTMENT.model;


public class ChristmasStocking extends HouseDecoration {
    public ChristmasStocking(Double price) {
        super("Christmas stocking", price);
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
    public String getDecorationType() {
        return super.getDecorationType();
    }

    @Override
    public void setDecorationType(String decorationType) {
        super.setDecorationType(decorationType);
    }
}
