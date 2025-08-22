/* 2.	Demonstrate the use of the super keyword*/
package day4_Assessment;

	class Person {
	    String name;
	    int age;

	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	        System.out.println("Person constructor called");
	    }

	    void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

	class Student extends Person {
	    int rollNumber;

	    Student(String name, int age, int rollNumber) {
	        super(name, age); 
	        this.rollNumber = rollNumber;
	        System.out.println("Student constructor called");
	    }

	    void displayDetails() {
	        super.displayInfo(); 
	        System.out.println("Roll Number: " + rollNumber);
	    }
	}

	public class SuperKeyword {
	    public static void main(String[] args) {
	        Student s = new Student("Jhon", 21, 101);
	        s.displayDetails();
	    }
	}
/* output
Person constructor called
Student constructor called
Name: Jhon
Age: 21
Roll Number: 101
*/
