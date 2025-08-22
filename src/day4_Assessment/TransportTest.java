package day4_Assessment;
class Transport {
 void start() {
     System.out.println("Transport is starting...");
 }
}

class Car extends Transport {
 void start() {
     System.out.println("Car is starting with a key ignition.");
 }
}
class TwoWheeler extends Transport {
 void start() {
     System.out.println("Bike is starting with a kick or self-start.");
 }
}
class Truck extends Transport {
 void start() {
     System.out.println("Truck is starting with a heavy-duty ignition.");
 }
}

public class TransportTest {
 static void startTransport(Transport t) {
     t.start(); 
 }

 public static void main(String[] args) {
     Transport car = new Car();
     Transport bike = new TwoWheeler();
     Transport truck = new Truck();
     System.out.println("***Car***");
     startTransport(car);

     System.out.println("\n***Bike***");
     startTransport(bike);

     System.out.println("\n***Truck***");
     startTransport(truck);
 }
}

/*
output:
	***Car***
	Car is starting with a key ignition.

	***Bike***
	Bike is starting with a kick or self-start.

	***Truck***
	Truck is starting with a heavy-duty ignition.
*/
