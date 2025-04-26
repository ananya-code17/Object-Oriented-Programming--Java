import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StudentFileReader {
    public static void main(String[] args) {
        String fileName = "student.txt"; // File to read

        try (FileReader fr = new FileReader(fileName)) {
            int character;
            System.out.println("Contents of the file:");

            // Read and display each character
            while ((character = fr.read()) != -1) {
                System.out.print((char) character);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + fileName + "' does not exist.");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            System.out.println("\nFile reading operation attempted.");
        }
    }
}
