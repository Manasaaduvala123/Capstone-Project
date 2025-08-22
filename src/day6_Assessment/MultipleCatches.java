package day6_Assessment;
import java.io.*;
public class MultipleCatches {
	public static void main(String[] args) {
        String filename = "input.txt";
        try {
            readFile(filename);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        finally {
            System.out.println("Cleanup done.");
        }
    }
    public static void readFile(String filename) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        System.out.println("First line: " + line);
        reader.close();
    }
}
/*
output:
File not found: input.txt
Cleanup done.
*/
