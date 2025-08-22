package day9_Assessments;
import java.util.*;
class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name); // Alphabetical order
    }
    public String toString() {
        return id + " - " + name;
    }
}
public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Rahul", 103));
        employees.add(new Employee("Anita", 101));
        employees.add(new Employee("Vikram", 105));
        employees.add(new Employee("Meena", 102));
        System.out.println("Before sorting:");
        for (Employee e : employees) {
            System.out.println(e);
        }
        Collections.sort(employees);
        System.out.println("\nAfter sorting by name (Alphabetical):");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

