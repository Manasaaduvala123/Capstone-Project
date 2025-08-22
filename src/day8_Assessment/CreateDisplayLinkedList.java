package day8_Assessment;
import java.util.LinkedList;

public class CreateDisplayLinkedList {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
