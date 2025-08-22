package day8_Assessment;
import java.util.ArrayList;
import java.util.LinkedList;
public class ConvertLinkedListToArrayList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Blue");
        linkedList.add("Green");
        linkedList.add("Yellow");
        ArrayList<String> arrayList = new ArrayList<>(linkedList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("ArrayList: " + arrayList);
    }
}
