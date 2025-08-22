package day1_day2_Assessment;
import java.util.Scanner;
public class LoanApproval {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your salary: ");
		int salary= sc.nextInt();
		System.out.println("Enter your credit score");
		int credit_score= sc.nextInt();
		if(salary>25000 && credit_score>=700)
		{
			System.out.println("loan approved");
		}
		else {
			System.out.println("Loan not approved");
		}
		sc.close();

	}

}
