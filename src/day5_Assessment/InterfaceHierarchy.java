package day5_Assessment;
interface BaseVehicle {
    void start();
}
interface AdvancedVehicle extends BaseVehicle {
    void stop();
    boolean refuel(int amount);
}
class Car implements AdvancedVehicle {
    private int fuel;
    public Car(int initialFuel) {
        this.fuel = initialFuel;
    }
    public void start() {
        if (fuel > 0) {
            System.out.println("Car started.");
        } else {
            System.out.println("Cannot start. No fuel.");
        }
    }
    public void stop() {
        System.out.println("Car stopped.");
    }
    public boolean refuel(int amount) {
        if (amount > 0) {
            fuel += amount;
            System.out.println("Refueled. Current fuel: " + fuel);
            return true;
        } else {
            System.out.println("Invalid fuel amount.");
            return false;
        }
    }
}
public class InterfaceHierarchy {
    public static void main(String[] args) {
        BaseVehicle base = new Car(0);
        base.start();
        AdvancedVehicle adv = new Car(10);
        adv.start();
        adv.refuel(20);
        adv.stop();
    }
}
