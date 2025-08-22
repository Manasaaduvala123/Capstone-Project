
package day7_Assessments;
public class WrapperClasses{
    public static void main(String[] args) {
        // 1. Check if character is a Digit
        char ch = '5';
        System.out.println("Is '" + ch + "' a digit? " + Character.isDigit(ch));
        // 2. Compare two Strings
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Comparing str1 and str2: " + str1.equals(str2));
        System.out.println("Comparing str1 with 'Hello': " + str1.equals("Hello"));
        // 3. Convert using valueOf method
        int num = 42;
        String numStr = String.valueOf(num);
        System.out.println("Converted int to String: " + numStr);
        double d = 3.14;
        Double dWrapper = Double.valueOf(d); 
        System.out.println("Converted double to Double: " + dWrapper);
        // 4. Create Boolean Wrapper usage
        Boolean bool1 = Boolean.valueOf(true);
        Boolean bool2 = Boolean.valueOf("false");
        System.out.println("Boolean 1: " + bool1);
        System.out.println("Boolean 2: " + bool2);
        // 5. Convert null to wrapper classes
        String nullStr = null;
        try {
            Integer nullInt = Integer.valueOf(nullStr);
            System.out.println("Converted null to Integer: " + nullInt);
        } catch (NumberFormatException e) {
            System.out.println("Cannot convert null String to Integer: " + e);
        }
        Integer wrapperNull = null;
        System.out.println("Wrapper directly assigned null: " + wrapperNull);
    }
}
