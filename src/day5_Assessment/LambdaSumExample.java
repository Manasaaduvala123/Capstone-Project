//1.	Sum of Two Integers
package day5_Assessment;
@FunctionalInterface
interface LambdaSum {
    int sum(int a, int b);
}
public class LambdaSumExample {
    public static void main(String[] args) {
        LambdaSum calculator = (a, b) -> a + b;
        int result = calculator.sum(800, 20);
        System.out.println("Sum: " + result);
    }
}

/*
output:
sum:820
*/
