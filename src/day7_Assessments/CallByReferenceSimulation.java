package day7_Assessments;
class IntWrapper {
    int value;
    IntWrapper(int value) {
        this.value = value;
    }
}
public class CallByReferenceSimulation {
    static void modify(IntWrapper num) {
        num.value = num.value + 10; 
    }
    public static void main(String[] args) {
        IntWrapper number = new IntWrapper(5);
        System.out.println("Before: " + number.value);        
        modify(number); 
        System.out.println("After: " + number.value); 
    }
}