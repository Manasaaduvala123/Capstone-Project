package day10_Assessment;
import java.io.File;
import java.io.FilenameFilter;

public class FilterTxtFiles {
    public static void main(String[] args) {
        File directory = new File("C:\\path\\wipro\\java\\text"); 
        FilenameFilter txtFilter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        };

        String[] txtFiles = directory.list(txtFilter);

        if (txtFiles != null && txtFiles.length > 0) {
            System.out.println(".txt files in the directory:");
            for (String file : txtFiles) {
                System.out.println(file);
            }
        } else {
            System.out.println("No .txt files found in the directory.");
        }
    }
}

