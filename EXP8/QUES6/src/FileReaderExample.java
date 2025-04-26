import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        try (FileReader reader = new FileReader(fileName)) {  // FileReader to read the file
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);  // Print file content character by character
            }
        } catch (IOException e) {
            System.out.println("Error: File not found or cannot be read!");
        } finally {
            System.out.println("\nFile operation attempted.");
            scanner.close();
        }
    }
}
