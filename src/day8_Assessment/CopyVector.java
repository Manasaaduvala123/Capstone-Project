
package day8_Assessment;
import java.util.Vector;

public class CopyVector {
    public static void main(String[] args) {
        Vector<Integer> vector1 = new Vector<>();
        vector1.add(10);
        vector1.add(20);
        vector1.add(30);
        vector1.add(40);
        Vector<Integer> vector2 = new Vector<>();
        vector2.addAll(vector1);
        System.out.println("Vector1: " + vector1);
        System.out.println("Vector2: " + vector2);
        if (vector1.equals(vector2)) 
        {
            System.out.println("Both vectors are equal.");
        } else {
            System.out.println("Vectors are not equal.");
        }
        int sum = sumVectorElements(vector1);
        System.out.println("Sum of elements in vector1: " + sum);
    }
    public static int sumVectorElements(Vector<Integer> vector) {
        int sum = 0;
        for (int num : vector) {
            sum += num;
        }
        return sum;
    }
}

