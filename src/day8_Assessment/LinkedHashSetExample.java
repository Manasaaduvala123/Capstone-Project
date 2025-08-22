package day8_Assessment;
import java.util.LinkedHashSet;
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(5); 
        System.out.println("Elements in LinkedHashSet:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

