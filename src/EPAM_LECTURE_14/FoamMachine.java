package EPAM_LECTURE_14;

class FoamMachine implements Runnable {
    private CarQueue dirtyCarQueue, foamedCarQueue;
    public FoamMachine(CarQueue dirtyCarQueue, CarQueue foamedCarQueue) {
        this.dirtyCarQueue = dirtyCarQueue;
        this.foamedCarQueue = foamedCarQueue;
    }
    public void run() {
        try {
            while(!Thread.interrupted()) {
                Car car = dirtyCarQueue.take();
                car.foam();
                foamedCarQueue.put(car);
            }
        } catch(InterruptedException e) {
            System.out.println("Foam mahine interrupted");
        }
        System.out.println("Foam machine crashed");
    }
}
