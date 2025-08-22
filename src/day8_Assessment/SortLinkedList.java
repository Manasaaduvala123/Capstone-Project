package day8_Assessment;
import java.util.Collections;
import java.util.LinkedList;
public class SortLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(42);
        numbers.add(7);
        numbers.add(19);
        numbers.add(3);
        numbers.add(25);
        Collections.sort(numbers);
        System.out.println("Sorted LinkedList: " + numbers);
    }
}
