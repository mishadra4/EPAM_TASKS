package EPAM_LECTURE_12.CHRISTMAS_DECORATION_DEPARTMENT.model;


public abstract class HouseDecoration extends ChristmasDecoration {
    public HouseDecoration(String name, Double price){
        super(name, price, "House");
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
