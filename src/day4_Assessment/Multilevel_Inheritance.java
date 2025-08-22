/* 1.	create multilevel inheritance for
Vehicle
Four_wheeler
Petrol_Four_Wheeler
FiveSeater_Petrol_Four_Wheeler
Baleno_FiveSeater_Petrol_Four_Wheeler
*/

package day4_Assessment;

class Vehicle {
    void vehicleType() {
        System.out.println("This is a vehicle");
    }
}

class FourWheeler extends Vehicle {
    void wheels() {
        System.out.println("It has 4 wheels");
    }
}

class PetrolFourWheeler extends FourWheeler {
    void fuelType() {
        System.out.println("Runs on petrol");
    }
}

class FiveSeaterPetrolFourWheeler extends PetrolFourWheeler {
    void seatingCapacity() {
        System.out.println("Seating capacity: 5");
    }
}

class BalenoFiveSeaterPetrolFourWheeler extends FiveSeaterPetrolFourWheeler {
    void modelName() {
        System.out.println("Model: Baleno");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        BalenoFiveSeaterPetrolFourWheeler car = new BalenoFiveSeaterPetrolFourWheeler();
        car.vehicleType();
        car.wheels();
        car.fuelType();
        car.seatingCapacity();
        car.modelName();
    }
}


/*
output
This is a vehicle
It has 4 wheels
Runs on petrol
Seating capacity: 5
Model: Baleno 
 */
