package EPAM_LECTURE_14.CAR_WASH_STATION_2;

import java.util.concurrent.TimeUnit;


class CarWashStation implements Runnable {
    private Car car;
    public CarWashStation(Car car) { this.car = car; }
    public void run() {
        Car car = new Car();
        System.out.println(car);
    }
}
