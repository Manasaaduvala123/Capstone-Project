package day7_Assessments;
public class PrimitiveNonPrimitive {
    static void changeValue(int x) {
        x = 50;
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Before: " + num);
        changeValue(num);
        System.out.println("After: " + num);
    }
}
