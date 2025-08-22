package day4_Assessment;
class Run {
    Run() {
        System.out.println("Vehicle Created");
    }
    void start() {
        System.out.println("Vehicle is starting...");
    }
}
class Bike extends Vehicle {
    Bike() {
        super();
        System.out.println("Bike Created");
    }
    void start() {
        System.out.println("Bike is starting with a kick!");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Bike v;       
        v = new Bike();  
        v.start();   
    }
}

/*
output
Bike Created
Bike is starting with a kick!
*/