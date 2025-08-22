package day9_Assessments;
import java.util.*;
public class SortStringsByLength {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Banana");
        strings.add("Apple");
        strings.add("Strawberry");
        strings.add("Kiwi");
        strings.add("Mango");
        System.out.println("Before Sorting:");
        System.out.println(strings);
        Collections.sort(strings, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        System.out.println("\nAfter Sorting by Length (Ascending):");
        System.out.println(strings);
    }
}

