
package day8_Assessment;
import java.util.LinkedList;
public class CloneLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> originalList = new LinkedList<>();
        originalList.add(5);
        originalList.add(10);
        originalList.add(15);
        originalList.add(20);
        LinkedList<Integer> clonedList = (LinkedList<Integer>) originalList.clone();
        System.out.println("Original LinkedList: " + originalList);
        System.out.println("Cloned LinkedList: " + clonedList);
    }
}
