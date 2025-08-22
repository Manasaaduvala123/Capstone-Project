package day8_Assessment;
import java.util.Vector;
import java.util.Enumeration;
public class VectorOperations {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        vector.insertElementAt(25, 2);
        vector.remove(1);
        Enumeration<Integer> elements = vector.elements();
        System.out.println("Elements in Vector:");
        while (elements.hasMoreElements()) {
            System.out.println(elements.nextElement());
        }
    }
}
