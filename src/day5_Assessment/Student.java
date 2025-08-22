/*
1. Student with Grade Validation & Configuration
Ensure marks are always valid and immutable once set.
•	Create a Student class with private fields: name, rollNumber, and marks.
•	Use a constructor to initialize all values and enforce marks to be between 0 and 100; invalid values reset to 0.
•	Provide getter methods, but no setter for marks (immutable after object creation).
•	Add displayDetails() to print all fields.
In future versions, you might allow updating marks only via a special inputMarks(int newMarks) method that has stricter logic
(e.g. cannot reduce marks). Design accordingly.-- give me the java code 
 */

package day5_Assessment;
public class Student {
	    private String name;
	    private int rollNumber;
	    private int marks;
	    public Student(String name, int rollNumber, int marks) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        if (marks >= 0 && marks <= 100) {
	            this.marks = marks;
	        } else {
	            this.marks = 0; 
	        }
	    }
	    public String getName() {
	        return name;
	    }

	    public int getRollNumber() {
	        return rollNumber;
	    }

	    public int getMarks() {
	        return marks;
	    }
	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Marks: " + marks);
	    }
	    public void inputMarks(int newMarks) {
	        if (newMarks >= 0 && newMarks <= 100 && newMarks > this.marks) {
	            this.marks = newMarks;
	        } else {
	            System.out.println("Invalid or lower marks. Update rejected.");
	        }
	    }
	    public static void main(String[] args) {
	        Student s1 = new Student("Neeva Sharma", 101, 85);
	        s1.displayDetails();
	        Student s2 = new Student("Robin Sharma", 102, 150);
	        s2.displayDetails();
	        s1.inputMarks(90); 
	        s1.displayDetails();
	        s1.inputMarks(80);
	        s1.displayDetails();
	    }
}

/*
output
Name: Neeva Sharma
Roll Number: 101
Marks: 85
Name: Robin Sharma
Roll Number: 102
Marks: 0
Name: Neeva Sharma
Roll Number: 101
Marks: 90
Invalid or lower marks. Update rejected.
Name: Neeva Sharma
Roll Number: 101
Marks: 90
*/
