package day1_day2_Assessment;
class Animal {
    String name = "Animal";
    void speak() {
        System.out.println("Animal speaks...");
    }
    void displayName() {
        System.out.println("Name from Animal: " + name);
    }
}
class Dog extends Animal {
    String name = "Dog";
    void speak() {
        System.out.println("Dog barks...");
    }
    void show() {
        System.out.println("Calling this.speak():");
        this.speak();
        System.out.println("Calling super.speak():");
        super.speak(); 
        System.out.println("this.name: " + this.name);   
        System.out.println("super.name: " + super.name);
    }
}
public class ThisAndSuper {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();
    }
}

/*
output
Calling this.speak():
Dog barks...
Calling super.speak():
Animal speaks...
this.name: Dog
super.name: Animal
*/