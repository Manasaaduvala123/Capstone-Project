package day7_Assessments;
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    static void updatePerson(Person p, String newName, int newAge) {
        p.name = newName;
        p.age = newAge;
    }
}
public class PassByObject {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        System.out.println("Before update: " + person.name + ", " + person.age);
        Person.updatePerson(person, "Bob", 30);
        System.out.println("After update: " + person.name + ", " + person.age);
    }
}
