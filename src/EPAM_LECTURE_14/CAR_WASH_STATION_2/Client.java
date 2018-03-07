package EPAM_LECTURE_14.CAR_WASH_STATION_2;

class Client implements Runnable {
    private Car washedCar;
    public Client(Car washedCar) {
        this.washedCar = washedCar;
    }
    public void run() {
        synchronized (washedCar) {
            while(washedCar.getStatus() != Car.Status.WASHED){
                try {
                    washedCar.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thank you! " + washedCar);
            System.out.println("Client go off");
        }
    }
}
