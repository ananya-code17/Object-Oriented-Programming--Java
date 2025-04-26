// ShapeDemo.java

// Abstract class Shape
abstract class Shape {
    // Abstract method (must be overridden by subclasses)
    abstract void calculateArea();
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private double length, width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding calculateArea method
    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding calculateArea method
    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {
        // Creating a Rectangle object and calculating area
        Shape rect = new Rectangle(5.0, 10.0);
        rect.calculateArea();

        // Creating a Circle object and calculating area
        Shape circ = new Circle(7.0);
        circ.calculateArea();
    }
}
