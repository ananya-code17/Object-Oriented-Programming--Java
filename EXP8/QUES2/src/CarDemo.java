// inner clas (non-staic nested class)

// Outer class Car
class Car {

    // Inner class Engine
    class Engine {
        // Method to start the engine
        public void start() {
            System.out.println("Engine started.");
        }

        // Method to stop the engine
        public void stop() {
            System.out.println("Engine stopped.");
        }
    }

    // Method to simulate driving
    public void drive() {
        Engine engine = new Engine(); // Creating an instance of the inner class
        engine.start(); // Starting the engine
        System.out.println("Car is driving...");
        engine.stop(); // Stopping the engine
    }
}

// Main class to test the functionality
public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating a Car instance
        myCar.drive(); // Calling the drive method
    }
}
