package day1_day2_Assessment;

public class OperatorsDemo {
	    public static void main(String[] args) {
	        int a = 10, b = 5;
	        System.out.println("Arithmetic Operators:");
	        System.out.println("a + b = " + (a + b));  
	        System.out.println("a - b = " + (a - b));  
	        System.out.println("a * b = " + (a * b));  
	        System.out.println("a / b = " + (a / b));  
	        System.out.println("a % b = " + (a % b)); 
	        System.out.println();
	        System.out.println("Relational Operators:");
	        System.out.println("a == b: " + (a == b));  
	        System.out.println("a != b: " + (a != b));  
	        System.out.println("a > b: " + (a > b));    
	        System.out.println("a < b: " + (a < b));    
	        System.out.println("a >= b: " + (a >= b));  
	        System.out.println("a <= b: " + (a <= b));  
	        System.out.println();
	        boolean x = true, y = false;
	        System.out.println("Logical Operators:");
	        System.out.println("x && y: " + (x && y));  
	        System.out.println("x || y: " + (x || y));  
	        System.out.println("!x: " + (!x));          
	    }
	}
	
/* output 
Arithmetic Operators:
a + b = 15
a - b = 5
a * b = 50
a / b = 2
a % b = 0

Relational Operators:
a == b: false
a != b: true
a > b: true
a < b: false
a >= b: true
a <= b: false

Logical Operators:
x && y: false
x || y: true
!x: false
*/