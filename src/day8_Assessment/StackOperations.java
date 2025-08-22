package day8_Assessment;
import java.util.Stack;
public class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Stack after pushes: " + stack);
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);
        int top = stack.peek();
        System.out.println("Current top element: " + top);
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

