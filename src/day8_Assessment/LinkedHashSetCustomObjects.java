package day8_Assessment;
import java.util.LinkedHashSet;
import java.util.Objects;
public class LinkedHashSetCustomObjects {
    static class Student {
        int id;
        String name;
        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Student other = (Student) obj;
            return id == other.id && Objects.equals(name, other.name);
        }
        public int hashCode() {
            return Objects.hash(id, name);
        }
        public String toString() {
            return "Student{id=" + id + ", name='" + name + "'}";
        }
    }
    public static void main(String[] args) {
        LinkedHashSet<Student> students = new LinkedHashSet<>();
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob");
        Student s3 = new Student(3, "Charlie");
        Student sDuplicate = new Student(2, "Bob");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        boolean added = students.add(sDuplicate);
        System.out.println("Trying to add duplicate student: " + (added ? "Added" : "Not Added"));
        System.out.println("Students in LinkedHashSet:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
