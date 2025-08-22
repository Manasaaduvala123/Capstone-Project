package day9_Assessments;
import java.util.*;
class Student {
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
    public String toString() {
        return name + " - Marks: " + marks;
    }
}
class MarksDescendingComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.getMarks(), s1.getMarks()); // Descending
    }
}
public class ComparatorExample {
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
        Collections.sort(students, new MarksDescendingComparator());
        System.out.println("\nAfter Sorting by Marks (Descending):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
