import java.util.Scanner;  // Import Scanner for user input

public class ArrayAccess {
    public static void main(String[] args) {
        // Creating an array of 5 integers
        int[] numbers = {10, 20, 30, 40, 50};

        Scanner scanner = new Scanner(System.in); // Create Scanner object

        try {
            // Asking user for an index
            System.out.print("Enter an index (0-4) to access the array element: ");
            int index = scanner.nextInt();

            // Accessing array element
            System.out.println("Element at index " + index + ": " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling invalid index access
            System.out.println("Error: Index out of bounds! Please enter a valid index (0-4).");

        } finally {
            // This block always executes
            System.out.println("Array access attempted.");
            scanner.close(); // Closing scanner to avoid resource leak
        }
    }
}
