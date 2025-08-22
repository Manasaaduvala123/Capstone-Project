package day8_Assessment;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetOperations {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("Sydney");
        boolean added = cities.add("Tokyo");
        System.out.println("Trying to add duplicate 'Tokyo': " + (added ? "Added" : "Not Added"));
        System.out.println("Cities in the HashSet:");
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        cities.remove("Paris");
        System.out.println("\nAfter removing 'Paris': " + cities);
        String cityToCheck = "London";
        System.out.println("Does '" + cityToCheck + "' exist? " + cities.contains(cityToCheck));
        cities.clear();
        System.out.println("After clearing, size of HashSet: " + cities.size());
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(35);
        numbers.add(20);
        numbers.add(50);
        numbers.add(5);
        System.out.println("\nNumbers in HashSet: " + numbers);
        int max = getMax(numbers);
        System.out.println("Maximum element in numbers HashSet: " + max);
    }
    public static int getMax(HashSet<Integer> set) {
        int max = Integer.MIN_VALUE;
        for (int num : set) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

