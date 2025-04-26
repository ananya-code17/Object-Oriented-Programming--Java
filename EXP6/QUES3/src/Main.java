// Parent class containing a final variable and a final method
class MathConstants {
    // final variable - cannot be changed
    final double PI = 3.14159;

    // final method - cannot be overridden in subclasses
    final void displayPI() {
        System.out.println("Value of PI: " + PI);
    }
}

// Child class attempting to override final method (which will cause an error)
class Circle extends MathConstants {
    // Method to calculate the area of a circle
    void calculateArea(double radius) {
        double area = PI * radius * radius; // Using final variable
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }

    // This will cause a compilation error if uncommented
    // @Override
    // void displayPI() {
    //     System.out.println("Trying to override final method!"); // ERROR
    // }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();

        // Calling the final method from the parent class
        circle.displayPI();

        // Calculating area using the inherited final variable
        circle.calculateArea(5.0);

        // Uncommenting the following line will cause an error
        // circle.PI = 3.14; // ERROR: cannot assign a value to final variable 'PI'
    }
}
