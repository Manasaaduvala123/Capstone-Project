package day9_Assessments;
import java.util.*;
class Student implements Comparable<Student> {
    private String name;
    private int marks;
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }
    public String toString() {
        return name + " - Marks: " + marks;
    }
}
public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ravi", 85));
        students.add(new Student("Anjali", 92));
        students.add(new Student("Vikram", 76));
        students.add(new Student("Meena", 88));
        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }
        Collections.sort(students);
        System.out.println("\nAfter Sorting by Marks (Ascending):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

