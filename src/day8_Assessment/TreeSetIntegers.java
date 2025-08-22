package day8_Assessment;
import java.util.TreeSet;
public class TreeSetIntegers {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        int givenNumber = 30;
        System.out.println("Element lower than " + givenNumber + ": " + numbers.lower(givenNumber));
        System.out.println("Element higher than " + givenNumber + ": " + numbers.higher(givenNumber));
    }
}
