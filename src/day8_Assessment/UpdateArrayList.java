
package day8_Assessment;
import java.util.ArrayList;

public class UpdateArrayList {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("English");
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("History");

        System.out.println("Before update: " + subjects);

        int index = subjects.indexOf("Math");
        if (index != -1) {
            subjects.set(index, "Statistics");
        } else {
            System.out.println("\"Math\" not found in the list.");
        }

        System.out.println("After update: " + subjects);
    }
}

