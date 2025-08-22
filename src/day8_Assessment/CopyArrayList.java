package day8_Assessment;
import java.util.ArrayList;
public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("Apple");
        firstList.add("Banana");
        firstList.add("Cherry");
        ArrayList<String> secondList = new ArrayList<>();
        secondList.addAll(firstList);
        System.out.println("First List: " + firstList);
        System.out.println("Second List: " + secondList);
    }
}

