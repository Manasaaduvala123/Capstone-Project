package day6_Assessment;
public class ExceptionDemo {
	    public static void main(String[] args) {
	    	try {
	            int a = 10;
	            int b = 0;
	            int result = a / b;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Division by zero is not allowed!");
	        } finally {
	            System.out.println("Operation completed.");
	        }
	        System.out.println();
	        try {
	            int[] numbers = {1, 2, 3};
	            int value = numbers[5]; 
	            System.out.println("Value: " + value);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index is out of bounds!");
	        } finally {
	            System.out.println("Operation completed.");
	        }
	    }
	}

/*
output:
Division by zero is not allowed!
Operation completed.

Array index is out of bounds!
Operation completed.
*/