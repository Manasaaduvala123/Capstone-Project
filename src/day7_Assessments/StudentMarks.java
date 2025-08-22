package day7_Assessments;
class Student {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    static void updateMarks(Student s, int newMarks) {
        s.marks = newMarks;
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Student student = new Student("John", 80);
        System.out.println("Before update: " + student.name + " - " + student.marks);
        Student.updateMarks(student, 95);
        System.out.println("After update: " + student.name + " - " + student.marks);
    }
}
