package day1_day2_Assessment;
import java.util.Scanner;

public class Squares {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting value: ");
		int initial_value=sc.nextInt();
		System.out.println("enter last value: ");
		int final_value=sc.nextInt();
		System.out.println("Squres in the given rage are: ");
		for(int i=initial_value;i<=final_value;i++)
		{
			System.out.println(i*i);
		}

	}

}
