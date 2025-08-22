package day8_Assessment;
import java.util.LinkedList;
public class RemoveElementFromLinkedList {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Giraffe");
        animals.add("Zebra");
        System.out.println("Original list: " + animals);
        animals.removeFirst();
        System.out.println("After removing first element: " + animals);
        animals.removeLast();
        System.out.println("After removing last element: " + animals);
        animals.remove("Elephant");
        System.out.println("After removing 'Elephant': " + animals);
    }
}
