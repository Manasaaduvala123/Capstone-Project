package day8_Assessment;
import java.util.LinkedList;
import java.util.Scanner;
public class SearchElementInLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to search: ");
        String searchStr = scanner.nextLine();
        if (list.contains(searchStr)) {
            System.out.println(searchStr + " is found in the list.");
        } else {
            System.out.println(searchStr + " is NOT found in the list.");
        }
        scanner.close();
    }
}
