package day8_Assessment;
import java.util.LinkedList;
public class AddFirstLast {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.addFirst(10);  
        numbers.addLast(50);  	
        System.out.println("Updated LinkedList: " + numbers);
    }
}
