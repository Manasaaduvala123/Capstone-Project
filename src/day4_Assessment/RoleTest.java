package day4_Assessment;
abstract class Persons {
 String name;
 int age;
 Persons(String name, int age) {
     this.name = name;
     this.age = age;
 }
 abstract void getRoleInfo();
}
class Students extends Persons {
 String course;
 int rollNumber;

 Students(String name, int age, String course, int rollNumber) {
     super(name, age);
     this.course = course;
     this.rollNumber = rollNumber;
 }
 void getRoleInfo() {
     System.out.println("Student Info:");
     System.out.println("Name: " + name + ", Age: " + age);
     System.out.println("Course: " + course + ", Roll No: " + rollNumber);
 }
}
class Professor extends Persons {
 String subject;
 double salary;

 Professor(String name, int age, String subject, double salary) {
     super(name, age);
     this.subject = subject;
     this.salary = salary;
 }
 void getRoleInfo() {
     System.out.println("Professor Info:");
     System.out.println("Name: " + name + ", Age: " + age);
     System.out.println("Subject: " + subject + ", Salary: ₹" + salary);
 }
}
class TeachingAssistant extends Students {
 String assistSubject;
 TeachingAssistant(String name, int age, String course, int rollNumber, String assistSubject) {
     super(name, age, course, rollNumber);
     this.assistSubject = assistSubject;
 }
 void getRoleInfo() {
     System.out.println("Teaching Assistant Info:");
     System.out.println("Name: " + name + ", Age: " + age);
     System.out.println("Course: " + course + ", Roll No: " + rollNumber);
     System.out.println("Assisting Subject: " + assistSubject);
 }
}
public class RoleTest {
 public static void main(String[] args) {
     Persons p1 = new Students("Manasa", 20, "B.Tech CSE", 101);
     Persons p2 = new Professor("Dr. Rao", 45, "Operating Systems", 95000);
     Persons p3 = new TeachingAssistant("Raj", 22, "B.Tech CSE", 202, "Java Programming");

     System.out.println("*************");
     p1.getRoleInfo();

     System.out.println("\n*************");
     p2.getRoleInfo();

     System.out.println("\n*************");
     p3.getRoleInfo();
 }
}

/*
output:
	*************
	Student Info:
	Name: Manasa, Age: 20
	Course: B.Tech CSE, Roll No: 101

	*************
	Professor Info:
	Name: Dr. Rao, Age: 45
	Subject: Operating Systems, Salary: ₹95000.0

	*************
	Teaching Assistant Info:
	Name: Raj, Age: 22
	Course: B.Tech CSE, Roll No: 202
	Assisting Subject: Java Programming
*/

