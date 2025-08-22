package day8_Assessment;
import java.util.Scanner;
import java.util.Stack;
public class BalancedParentheses {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty(); 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String expr = scanner.nextLine();
        if (isBalanced(expr)) {
            System.out.println("Valid expression");
        } else {
            System.out.println("Invalid expression");
        }
        scanner.close();
    }
}
