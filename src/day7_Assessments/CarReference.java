package day7_Assessments;
class Car {
    String model;

    Car(String model) {
        this.model = model;
    }
    static void assignNewObject(Car c) {
        c = new Car("Tesla");
    }
}
public class CarReference {
    public static void main(String[] args) {
        Car myCar = new Car("BMW");
        System.out.println("Before assignNewObject: " + myCar.model);
        Car.assignNewObject(myCar);
        System.out.println("After assignNewObject: " + myCar.model);
    }
}