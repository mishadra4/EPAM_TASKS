package EPAM_LECTURE_14.CAR_WASH_STATION_2;

class FoamMachine implements Runnable {
    private Car dirtyCar, foamedCar;
    public FoamMachine(Car dirtyCar, Car foamedCar) {
        this.dirtyCar = dirtyCar;
        this.foamedCar = foamedCar;
    }
    public void run() {
        synchronized (dirtyCar) {
            while (dirtyCar.getStatus() != Car.Status.DIRTY)
                try {
                    dirtyCar.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            dirtyCar.foam();
            System.out.println(dirtyCar);
            foamedCar = dirtyCar;
            new Thread(new WashMachine(dirtyCar,foamedCar)).start();
        }
        System.out.println("Foam machine off");
    }
}
