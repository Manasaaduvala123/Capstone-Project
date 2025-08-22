
package day8_Assessment;
import java.util.ArrayList;
import java.util.Scanner;
public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the fruit to remove: ");
        String fruitToRemove = scanner.nextLine();
        if (fruits.remove(fruitToRemove)) {
            System.out.println(fruitToRemove + " removed successfully.");
        } else {
            System.out.println(fruitToRemove + " not found in the list.");
        }
        System.out.println("Updated list of fruits: " + fruits);
        scanner.close();
    }
}
