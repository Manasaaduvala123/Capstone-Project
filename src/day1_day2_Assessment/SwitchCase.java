package day1_day2_Assessment;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter signal colour:)red, yelloe, green");
		String colour=sc.nextLine();
		switch (colour.toLowerCase())
		{
			case "red":
				System.out.println("stop");
				break;
			case "yellow":
				System.out.println("ready");
				break;
			case "green":
				System.out.println("go");
				break;
			default:
				System.out.println("invalid input");
		}
		sc.close();
	}
		
	}

