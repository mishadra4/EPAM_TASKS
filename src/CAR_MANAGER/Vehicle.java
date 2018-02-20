package CAR_MANAGER;


public abstract class Vehicle {
    private Engine engine;
    private GearBox gearBox;

    public Vehicle(Engine engine, GearBox gearBox) {
        this.engine = engine;
        this.gearBox = gearBox;
    }

    public Vehicle() {
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }
}
