package day8_Assessment;
import java.util.ArrayList;
import java.util.Collections;
public class SortElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(34);
        numbers.add(12);
        numbers.add(89);
        numbers.add(5);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);

        Collections.sort(numbers);

        System.out.println("Sorted list: " + numbers);
    }
}
