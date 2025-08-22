package day1_day2_Assessment;
import java.util.Scanner;
public class Even_Numbers_in_Range {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting value: ");
		int starting_value=sc.nextInt();
		System.out.println("enter maximum limit: ");
		int last_value=sc.nextInt();
		System.out.println("even numbers are: ");
		for(int i=0;i<last_value;i++)
		{
			if(i%2==0)
			{
				System.out.print(+i +" ");
			}
		}
		sc.close();

	}

}
/* 
 output: 
 Enter starting value: 
2
enter maximum limit: 
50
even numbers are: 
0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 
 */ 
