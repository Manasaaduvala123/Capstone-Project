
package day6_Assessment;
class Animal {
    void makeSound() {
        System.out.println("Some animal sound");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
    void fetch() {
        System.out.println("Dog is fetching the ball!");
    }
}
public class ObjectCasting {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = d;
        a.makeSound();
    }
}
