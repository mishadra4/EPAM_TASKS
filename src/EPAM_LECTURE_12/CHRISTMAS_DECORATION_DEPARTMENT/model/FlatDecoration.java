package EPAM_LECTURE_12.CHRISTMAS_DECORATION_DEPARTMENT.model;

public abstract class FlatDecoration extends ChristmasDecoration {

    public FlatDecoration(String name, Double price){
        super(name, price, DecorationType.FLAT);
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
