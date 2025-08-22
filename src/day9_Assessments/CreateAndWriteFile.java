package day9_Assessments;
import java.io.FileWriter;
import java.io.IOException;
public class CreateAndWriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("student.txt");
            writer.write("Ravi Kumar\n");
            writer.write("Anjali Sharma\n");
            writer.write("Meena Patel\n");
            writer.write("Vikram Singh\n");
            writer.write("Priya Verma\n");
            writer.close();
            System.out.println("File created and student names written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

