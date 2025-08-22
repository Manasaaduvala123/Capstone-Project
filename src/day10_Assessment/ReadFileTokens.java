package day10_Assessment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileTokens {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            Scanner scanner = new Scanner(file);

            System.out.println("Tokens in the file:");
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
