package day8_Assessment;
import java.util.TreeSet;
import java.util.Comparator;
public class TreeSetComparator {
    public static void main(String[] args) {
        Comparator<String> reverseComparator = (s1, s2) -> s2.compareTo(s1);
        TreeSet<String> names = new TreeSet<>(reverseComparator);
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");
        System.out.println("Strings in reverse alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

