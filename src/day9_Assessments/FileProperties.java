package day9_Assessments;
import java.io.File;

public class FileProperties {
    public static void main(String[] args) {
        File file = new File("notes.txt");

        if (file.exists()) {
            System.out.println("File exists.");
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("File name: " + file.getName());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length());
        } else {
            System.out.println("The file 'report.txt' does not exist.");
        }
    }
}

