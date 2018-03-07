package EPAM_LECTURE_14.CAR_WASH_STATION_2;

class WashMachine implements Runnable {
    private Car foamedCar, washedCar;
    public WashMachine(Car foamedCar, Car washedCar) {
        this.foamedCar = foamedCar;
        this.washedCar = washedCar;
    }
    public void run() {
        synchronized (foamedCar) {
            try {
                while (foamedCar.getStatus() != Car.Status.FOAMED) {
                    foamedCar.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            foamedCar.wash();
            System.out.println(foamedCar);
            washedCar = foamedCar;
        }
        new Thread(new Client(washedCar)).start();
        System.out.println("WashMachine off");
    }
}
