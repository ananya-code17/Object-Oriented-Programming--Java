import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentFileWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        
        System.out.print("Enter Grade: ");
        char grade = scanner.next().charAt(0);

        // Writing to file using FileWriter in append mode
        try (FileWriter fw = new FileWriter("student.txt", true)) { // true -> append mode
                                                                                    // if we don't use true overwrites the file instead of appending data because you didn't enable append mode.
            fw.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            System.out.println("Student details saved successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            System.out.println("File operation attempted.");
            scanner.close();
        }
    }
}
