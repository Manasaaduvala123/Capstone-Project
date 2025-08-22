
package day8_Assessment;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int inputNumber = scanner.nextInt();
        if (numbers.contains(inputNumber)) {
            System.out.println(inputNumber + " exists in the list.");
        } else {
            System.out.println(inputNumber + " does not exist in the list.");
        }
        scanner.close();
    }
}
