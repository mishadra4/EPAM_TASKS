package EPAM_LECTURE_14;

import java.util.Random;
import java.util.concurrent.TimeUnit;


class CarWashStation implements Runnable {
    private CarQueue carQueue;
    private int count = 0;
    private Random rand = new Random(47);
    public CarWashStation(CarQueue tq) { carQueue = tq; }
    public void run() {
        try {
            while(!Thread.interrupted()) {
                TimeUnit.MILLISECONDS.sleep(100 );
                Car t = new Car(count++);
                System.out.println(t);
                carQueue.put(t);
            }
        } catch(InterruptedException e) {
            System.out.println("CarWashStation interrupted");
        }

        System.out.println("Car washed");
    }
}
