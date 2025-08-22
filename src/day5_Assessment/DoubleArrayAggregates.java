package day5_Assessment;
import java.util.Arrays;
public class DoubleArrayAggregates {
    public static void main(String[] args) {
        double[] numbers = { 5.5, 2.3, 8.7, 4.4, 6.6 };
        double sum = Arrays.stream(numbers).sum();
        double max = Arrays.stream(numbers).max().orElse(Double.NaN);
        double average = Arrays.stream(numbers).average().orElse(Double.NaN);
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);
    }
}
