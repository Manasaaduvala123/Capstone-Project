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
     return this.name.compareToIgnoreCase(other.name);
 }
 public String toString() {
     return name + " - Marks: " + marks;
 }
}
public class StudentSortingDemo {
 public static void main(String[] args) {
     List<Student> students = new ArrayList<>();
     students.add(new Student("Ravi", 85));
     students.add(new Student("Anjali", 92));
     students.add(new Student("Vikram", 76));
     students.add(new Student("Meena", 88));
     Collections.sort(students);
     System.out.println("Sorted by Name (Alphabetical):");
     students.forEach(System.out::println);
     students.sort(new Comparator<Student>() {
         public int compare(Student s1, Student s2) {
             return Integer.compare(s2.getMarks(), s1.getMarks()); // Descending
         }
     });
     System.out.println("\nSorted by Marks (Descending):");
     students.forEach(System.out::println);
 }
}
