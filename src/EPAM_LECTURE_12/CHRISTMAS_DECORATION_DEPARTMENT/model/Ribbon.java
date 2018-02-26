package EPAM_LECTURE_12.CHRISTMAS_DECORATION_DEPARTMENT.model;


public class Ribbon extends FlatDecoration {
    public Ribbon(Double price) {
        super("Ribbon", price);
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
