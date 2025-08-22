package day7_Assessments;
public class PrimitivePass{

    public static void modifyValues(int a, double b, char c) {
        System.out.println("Inside method before change: a = " + a + ", b = " + b + ", c = " + c);
        a = a + 10;  
        b = b * 2;    
        c = 'Z';            
        System.out.println("Inside method after change: a = " + a + ", b = " + b + ", c = " + c);
    }
    public static void main(String[] args) {
        int num = 5;
        double value = 3.5;
        char letter = 'A';
        System.out.println("Before method call: num = " + num + ", value = " + value + ", letter = " + letter);       
        modifyValues(num, value, letter);      
        System.out.println("After method call: num = " + num + ", value = " + value + ", letter = " + letter);
    }
}

