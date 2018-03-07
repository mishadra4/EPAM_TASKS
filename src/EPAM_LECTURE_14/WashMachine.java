package EPAM_LECTURE_14;

class WashMachine implements Runnable {
    private CarQueue foamedCarQueue, washedCarQueue;
    public WashMachine(CarQueue foamedCarQueue, CarQueue washedCarQueue) {
        this.foamedCarQueue = foamedCarQueue;
        this.washedCarQueue = washedCarQueue;
    }
    public void run() {
        try {
            while(!Thread.interrupted()) {
                Car t = foamedCarQueue.take();
                t.wash();
                System.out.println(t);
                washedCarQueue.put(t);
            }
        } catch(InterruptedException e) {
            System.out.println("WashMachine off");
        }
        System.out.println("WashMachine off");
    }
}
