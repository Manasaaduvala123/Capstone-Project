package day8_Assessment;
import java.util.ArrayList;

public class RemoveAllElementsInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.clear();

        System.out.println("Size of the list after clear: " + numbers.size());
    }
}

