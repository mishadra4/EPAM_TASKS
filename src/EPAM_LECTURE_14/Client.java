package EPAM_LECTURE_14;

class Client implements Runnable {
    private CarQueue washedCarQueue;
    private int counter = 0;
    public Client(CarQueue washedCarQueue) {
        this.washedCarQueue = washedCarQueue;
    }
    public void run() {
        try {
            while(!Thread.interrupted()) {
                Car car = washedCarQueue.take();
                if(car.getId() != counter++ ||
                        car.getStatus() != Car.Status.WASHED) {
                    System.out.println(">>>> Error: " + car);
                    System.exit(1);
                } else
                    System.out.println("Chomp! " + car);
            }
        } catch(InterruptedException e) {
            System.out.println("Client interrupted");
        }
        System.out.println("Client go off");
    }
}
