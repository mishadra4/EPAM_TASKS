package EPAM_LECTURE_14;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        CarQueue dirtyCarQueue = new CarQueue(),
                foamedCarQueue = new CarQueue(),
                washedCarQueue = new CarQueue();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new CarWashStation(dirtyCarQueue));
        exec.execute(new FoamMachine(dirtyCarQueue, foamedCarQueue));
        exec.execute(new WashMachine(foamedCarQueue, washedCarQueue));
        exec.execute(new Client(washedCarQueue));
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        exec.shutdownNow();
    }
}
