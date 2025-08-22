package day5_Assessment;
@FunctionalInterface
interface FactorialCalculator {
    long factorial(int n);
}
public class LambdaFactorial {
    public static void main(String[] args) {
        FactorialCalculator fact = (n) -> {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };       
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + fact.factorial(number));
    }
}

