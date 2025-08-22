package day5_Assessment;
@FunctionalInterface
interface SumCalculator {
 int sum(int a, int b);
}
public class LambdaSumDemo {
 public static void main(String[] args) {
     SumCalculator calculator = (a, b) -> a + b;
     int result = calculator.sum(10, 20);    
     System.out.println("Sum: " + result);
 }
}
