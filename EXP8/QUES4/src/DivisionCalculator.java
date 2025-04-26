import java.util.Scanner;  // Import Scanner for user input

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        try {
            // Taking input from user
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Performing division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        
        } catch (ArithmeticException e) {
            // Handling division by zero
            System.out.println("Error: Cannot divide by zero.");
        
        } finally {
            // This block always executes
            System.out.println("Operation completed.");
            scanner.close(); // Closing scanner to avoid resource leak
        }
    }
}
