import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintPracticeTester {
    public static void compareFiles(String file1, String file2) {
        try (Scanner scanner1 = new Scanner(new File(file1));
             Scanner scanner2 = new Scanner(new File(file2))) {
            
            int lineNumber = 1;
            
            while (scanner1.hasNextLine() && scanner2.hasNextLine()) {
                String line1 = scanner1.nextLine();
                String line2 = scanner2.nextLine();
                
                if (!line1.equals(line2)) {
                    System.out.println("Files differ at line " + lineNumber);
                    return;
                }
                lineNumber++;
            }
            
            if (scanner1.hasNextLine() || scanner2.hasNextLine()) {
                System.out.println("Files differ in length. Difference starts at line " + lineNumber);
            } else {
                System.out.println("Files are identical.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        compareFiles("output.txt", "answer.txt");
    }
}

