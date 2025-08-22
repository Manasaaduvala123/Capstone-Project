package day6_Assessment;
import java.io.*;
public class MultiExceptionDemo {
	public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            File file = new File("input.txt");
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            int number = Integer.parseInt(line);
            int result = 100 / number;
            System.out.println("Result: " + result);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("Problem reading file");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        finally {
            System.out.println("Execution completed");
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
    }
}
