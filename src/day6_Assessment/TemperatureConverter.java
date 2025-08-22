package day6_Assessment;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;
        int truncatedFahrenheit = (int) fahrenheit;
        System.out.println("Fahrenheit (precise): " + fahrenheit);
        System.out.println("Fahrenheit (truncated to int): " + truncatedFahrenheit);
        System.out.println("Note: Truncating removes decimal part, causing precision loss.");        
        sc.close();
    }
}