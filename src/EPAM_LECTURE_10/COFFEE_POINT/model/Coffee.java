package EPAM_LECTURE_10.COFFEE_POINT.model;

public class Coffee extends Product {
    private CoffeeBrand coffeeBrand;
    private CoffeeType coffeeType;

    public Coffee(CoffeeBrand coffeeBrand, CoffeeType coffeeType){
        this.coffeeBrand = coffeeBrand;
        this.coffeeType = coffeeType;
        super.setName(coffeeType.toString());
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public CoffeeBrand getCoffeeBrand() {
        return coffeeBrand;
    }

    public void setCoffeeBrand(CoffeeBrand coffeeBrand) {
        this.coffeeBrand = coffeeBrand;
    }
}
