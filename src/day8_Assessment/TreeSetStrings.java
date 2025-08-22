package day8_Assessment;
import java.util.TreeSet;
public class TreeSetStrings {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("India");
        countries.add("Germany");
        countries.add("Brazil");
        countries.add("Australia");
        countries.add("Canada");
        System.out.println("Sorted countries:");
        for (String country : countries) {
            System.out.println(country);
        }
    }
}


