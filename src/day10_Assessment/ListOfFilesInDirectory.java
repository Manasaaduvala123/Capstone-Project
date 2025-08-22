package day10_Assessment;
import java.io.File;

public class ListOfFilesInDirectory {
    public static void main(String[] args) {
        File directory = new File("C:\\path\\to\\your\\folder"); // Change to your directory path

        if (directory.isDirectory()) {
            String[] files = directory.list();
            if (files != null && files.length > 0) {
                System.out.println("Files in directory:");
                for (String file : files) {
                    System.out.println(file);
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The specified path is not a directory.");
        }
    }
}
