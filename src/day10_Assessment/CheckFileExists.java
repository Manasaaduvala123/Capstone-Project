package day10_Assessment;
import java.io.File;

public class CheckFileExists {
    public static void main(String[] args) {
        String filePath = "test.txt"; // Change path as needed
        File file = new File(filePath);

        if (file.exists()) {
            System.out.println("File exists at: " + file.getAbsolutePath());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
