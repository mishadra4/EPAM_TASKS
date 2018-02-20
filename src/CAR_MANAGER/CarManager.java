package CAR_MANAGER;


public class CarManager {
    Vehicle truck = new Truck(new DieselEngine(), new ManualGearBox());
    Vehicle car = new Car(new ElectricEngine(), new AutoGearBox());
    Vehicle Bus = new Bus(new PetrolEngine(), new ManualGearBox());
}
