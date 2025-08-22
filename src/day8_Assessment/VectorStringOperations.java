package day8_Assessment;
import java.util.Vector;
public class VectorStringOperations {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");
        if (names.contains("Charlie")) {
            System.out.println("Charlie is in the vector.");
        } else {
            System.out.println("Charlie is not in the vector.");
        }
        int index = names.indexOf("Bob");
        if (index != -1) {
            names.set(index, "Brian");
        }
        System.out.println("After replacement: " + names);
        names.clear();
        System.out.println("After clearing, vector size: " + names.size());
    }
}

/*
output:
Charlie is in the vector.
After replacement: [Alice, Brian, Charlie, Diana]
After clearing, vector size: 0
*/