/*
2.	Convert an int to String using String.valueOf(...),
then back with Integer.parseInt(...). 
Handle NumberFormatException.
 */

package day6_Assessment;
public class IntStringConversion {
    public static void main(String[] args) {
        int num = 123;       
        String str = String.valueOf(num);
        System.out.println("Integer to String: " + str);       
        try {
            int parsedNum = Integer.parseInt(str);
            System.out.println("String back to Integer: " + parsedNum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }
    }
}


/*
output:
Integer to String: 123
String back to Integer: 123
*/