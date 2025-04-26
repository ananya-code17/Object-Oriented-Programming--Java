public class App3 {
    // Function for addition
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Function for subtraction
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Function for multiplication
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Command Line Calculator!");
        int num1 = 50;
        int num2 = 60;
        System.out.println("Choose an operation: ");
        System.out.println("1. Add (+)");
        System.out.println("2. Subtract (-)");
        System.out.println("3. Multiply (*)");
        int choice = 1;
        switch (choice) {
            case 1:
                System.out.println("Result: " + add(num1, num2));
            case 2:
                System.out.println("Result: " + subtract(num1, num2));
            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }
    }
}
