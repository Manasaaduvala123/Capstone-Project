package day1_day2_Assessment;

public class BitWiseOperator {
	    public static void main(String[] args) {
	        int a = 5;  
	        int b = 3;  
	        int andResult = a & b;
	        System.out.println("a & b = " + andResult);  
	        int orResult = a | b;
	        System.out.println("a | b = " + orResult);   
	        int xorResult = a ^ b;
	        System.out.println("a ^ b = " + xorResult);  
	        int notA = ~a;
	        System.out.println("~a = " + notA);         
	        int leftShift = a << 1;
	        System.out.println("a << 1 = " + leftShift); 
	        int rightShift = a >> 1;
	        System.out.println("a >> 1 = " + rightShift);
	    }
	}

/*
output
a & b = 1
a | b = 7
a ^ b = 6
~a = -6
a << 1 = 10
a >> 1 = 2
*/