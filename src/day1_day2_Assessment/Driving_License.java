package day1_day2_Assessment;
import java.util.*;
public class Driving_License {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.println("eligible to get driving license");
		}
		else
		{
			System.out.println("Not eligible to get driving license");
			
		}
		

	}

}
