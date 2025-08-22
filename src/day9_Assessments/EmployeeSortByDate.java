package day9_Assessments;
import java.time.LocalDate;
import java.util.*;
class Employee {
    private String name;
    private LocalDate joiningDate;
    public Employee(String name, LocalDate joiningDate) {
        this.name = name;
        this.joiningDate = joiningDate;
    }
    public String getName() {
        return name;
    }
    public LocalDate getJoiningDate() {
        return joiningDate;
    }
    public String toString() {
        return name + " - Joined: " + joiningDate;
    }
}
public class EmployeeSortByDate {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ravi", LocalDate.of(2022, 5, 10)));
        employees.add(new Employee("Anjali", LocalDate.of(2020, 8, 21)));
        employees.add(new Employee("Meena", LocalDate.of(2021, 1, 15)));
        employees.add(new Employee("Vikram", LocalDate.of(2023, 3, 5)));
        System.out.println("Before Sorting:");
        employees.forEach(System.out::println);
        employees.sort(Comparator.comparing(Employee::getJoiningDate));
        System.out.println("\nAfter Sorting by Joining Date (Oldest First):");
        employees.forEach(System.out::println);
        employees.sort(Comparator.comparing(Employee::getJoiningDate).reversed());
        System.out.println("\nAfter Sorting by Joining Date (Newest First):");
        employees.forEach(System.out::println);
    }
}
