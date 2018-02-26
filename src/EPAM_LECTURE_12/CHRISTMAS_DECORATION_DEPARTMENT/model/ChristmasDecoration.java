package EPAM_LECTURE_12.CHRISTMAS_DECORATION_DEPARTMENT.model;

public abstract class ChristmasDecoration {
    private String name;
    private Double price;
    private String decorationType;

    public ChristmasDecoration(String name, Double price, String decorationType) {
        this.name = name;
        this.price = price;
        this.decorationType = decorationType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDecorationType() {
        return decorationType;
    }

    public void setDecorationType(String decorationType) {
        this.decorationType = decorationType;
    }

    @Override
    public String toString() {
        return "ChristmasDecoration{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", decorationType=" + decorationType +
                '}';
    }
}
