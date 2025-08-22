package day5_Assessment;
interface Sum {
    int add(int a, int b);
}

public class SumCalculatorLambda {
    public static void main(String[] args) {
        Sum sum = (a, b) -> a + b;

        int result = sum.add(10, 20);
        System.out.println("Sum: " + result);
    }
}

/*
 * output: sum: 30
 */
	
