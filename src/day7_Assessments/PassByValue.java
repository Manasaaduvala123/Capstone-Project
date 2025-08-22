package day7_Assessments;
public class PassByValue {
    public static void changeValue(int num) {
        System.out.println("Inside method before change: " + num);
        num = num + 10; 
        System.out.println("Inside method after change: " + num);
    }
    public static void main(String[] args) {
        int original = 5;
        System.out.println("Before method call: " + original);       
        changeValue(original);        
        System.out.println("After method call: " + original);
    }
}
