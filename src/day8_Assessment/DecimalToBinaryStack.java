package day8_Assessment;
import java.util.Scanner;
import java.util.Stack;
public class DecimalToBinaryStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        if (decimal == 0) {
            System.out.println("Binary: 0");
            scanner.close();
            return;
        }
        while (decimal > 0) {
            stack.push(decimal % 2);
            decimal = decimal / 2;
        }
        System.out.print("Binary: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        scanner.close();
    }
}

