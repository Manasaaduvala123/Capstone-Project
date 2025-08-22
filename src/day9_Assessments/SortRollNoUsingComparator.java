package day9_Assessments;
import java.util.*;
class Student implements Comparable<Student>
{
	int rollNo;
	String name;
	double marks;
	Student(int rollNo, String name, double marks)
	{
		this.rollNo = rollNo;
	    this.name = name;
	    this.marks = marks;
	    }
	    public int compareTo(Student s) {
	        return this.rollNo - s.rollNo; 
	    }
	    public String toString() {
	        return rollNo + "  " + name + "  " + marks;
	    }
	}
	public class SortRollNoUsingComparator {
	    public static void main(String[] args) {
	        List<Student> students = new ArrayList<>();
	        students.add(new Student(102, "Natasha", 88.5));
	        students.add(new Student(101, "Manisha", 92.0));
	        students.add(new Student(105, "Ravi", 76.3));
	        students.add(new Student(103, "Arjun", 85.4));
	        Collections.sort(students);
	        System.out.println("Students sorted by Roll Number:");
	        for (Student s : students) {
	            System.out.println(s);
	        }
	    }
	}


