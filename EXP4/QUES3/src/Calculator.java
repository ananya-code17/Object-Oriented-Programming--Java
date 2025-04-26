public class Calculator {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    
    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Create an object of the Calculator class
        Calculator calculator = new Calculator();
        
        // Demonstrating the add method with different parameter types and numbers
        System.out.println("Addition of two integers (5 + 3): " + calculator.add(5, 3));
        System.out.println("Addition of two doubles (2.5 + 3.5): " + calculator.add(2.5, 3.5));
        System.out.println("Addition of three integers (1 + 2 + 3): " + calculator.add(1, 2, 3));
    }
}
