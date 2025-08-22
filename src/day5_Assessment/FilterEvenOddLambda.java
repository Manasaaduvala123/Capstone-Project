package day5_Assessment;
import java.util.Arrays;
import java.util.List;
public class FilterEvenOddLambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        System.out.println("Even Numbers:");
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        System.out.println("Odd Numbers:");
        numbers.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
    }
}