package day9_Assessments;
import java.io.FileWriter;
import java.io.IOException;
public class AppendToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("student.txt", true);
            writer.write("Arjun Malhotra\n");
            writer.close();
            System.out.println("New student name appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}
