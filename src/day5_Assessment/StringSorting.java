package day5_Assessment;
import java.util.*;
public class StringSorting {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Banana", "Apple", "Mango", "Grapes", "Orange");
        List<String> alphaList = new ArrayList<>(words);
        Collections.sort(alphaList);
        System.out.println("Alphabetical Order: " + alphaList);
        List<String> lengthList = new ArrayList<>(words);
        lengthList.sort((a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println("Sorted by Length: " + lengthList);
    }
}
