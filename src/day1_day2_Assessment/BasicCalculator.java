package day1_day2_Assessment;
import java.util.*;
public class BasicCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();
	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();
	        System.out.println("Choose an operation: +, -, *, /");
	        char operator = scanner.next().charAt(0);
	        double result;
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                System.out.println("Result of Addition is: " + result);
	                break;
	            case '-':
	                result = num1 - num2;
	                System.out.println("Result of Subtraction is: " + result);
	                break;
	            case '*':
	                result = num1 * num2;
	                System.out.println("Result of Multiplication is: " + result);
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Result of Division is: " + result);
	                } else {
	                    System.out.println("Error: Cannot divide by zero.");
	                }
	                break;
	            default:
	                System.out.println("Invalid operator!");
	        }
	        scanner.close();
	    }
	}
/* 
output
//for addition
Enter first number: 20
Enter second number: 40
Choose an operation: +, -, *, /
+
Result of Addition is: 60.0

//for subtraction
Enter first number: 40
Enter second number: 15
Choose an operation: +, -, *, /
-
Result of Subtraction is: 25.0
//for multiplication
Enter first number: 20
Enter second number: 40
Choose an operation: +, -, *, /
*
Result of Multiplication is: 800.0

//for division
Enter first number: 80
Enter second number: 12
Choose an operation: +, -, *, /
/
Result of Division is: 6.666666666666667
 */