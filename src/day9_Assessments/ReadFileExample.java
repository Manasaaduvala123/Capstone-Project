package day9_Assessments;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFileExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("student.txt"));
            String line;
            System.out.println("Contents of student.txt:");
                        while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

