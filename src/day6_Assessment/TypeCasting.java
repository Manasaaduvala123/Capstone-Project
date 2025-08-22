/*
1.	Write a program to:
o	Read an int value from user input.
o	Assign it to a double (implicit widening) and print both.
o	Read a double, explicitly cast it to int, then to short, and print results—demonstrate truncation or overflow.
 */

package day6_Assessment;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();
        double widenedValue = intValue;
        System.out.println("Integer value: " + intValue);
        System.out.println("After implicit widening to double: " + widenedValue);
        System.out.print("Enter a double: ");
        double doubleValue = sc.nextDouble();
        int castToInt = (int) doubleValue;
        short castToShort = (short) doubleValue;
        System.out.println("Original double: " + doubleValue);
        System.out.println("After explicit cast to int: " + castToInt);
        System.out.println("After explicit cast to short: " + castToShort);
        sc.close();
    }
}

/*
output:
Enter an integer: 88
Integer value: 88
After implicit widening to double: 88.0
Enter a double: 12357.4589
Original double: 12357.4589
After explicit cast to int: 12357
After explicit cast to short: 12357
*/