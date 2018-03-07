package EPAM_LECTURE_14.CAR_WASH_STATION_2;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        Car dirtyCar = new Car(), foamedCar = dirtyCar, washedCar = dirtyCar;

        ExecutorService exec = Executors.newCachedThreadPool();



        //exec.execute(new CarWashStation(dirtyCar));

        exec.execute(new Client(washedCar));

        exec.execute(new FoamMachine(dirtyCar, foamedCar));

        exec.execute(new WashMachine(foamedCar, washedCar));




        exec.shutdownNow();
    }
}
