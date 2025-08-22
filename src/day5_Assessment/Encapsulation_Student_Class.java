package day5_Assessment;
public class Encapsulation_Student_Class {
    private String name;
    private int rollNumber;
    private int marks;

    public Encapsulation_Student_Class(String name, int rollNumber, int marks) {
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

    public void inputMarks(int newMarks) {
        if (newMarks >= 0 && newMarks <= 100 && newMarks > this.marks) {
            this.marks = newMarks;
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
    	Encapsulation_Student_Class s1 = new Encapsulation_Student_Class("Manasa", 101, 85);
        s1.displayDetails();

        s1.inputMarks(70);
        System.out.println("After trying to reduce marks:");
        s1.displayDetails();

        s1.inputMarks(90);
        System.out.println("After increasing marks:");
        s1.displayDetails();
    }
}
