package EPAM_LECTURE_12.CHRISTMAS_DECORATION_DEPARTMENT.model;


public abstract class StreetDecoration extends ChristmasDecoration {
    public StreetDecoration(String name, Double price){
        super(name, price, "Street");
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
