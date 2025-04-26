class Vehicle {  //superclass
    protected String brand;
    protected String model;
    protected double price;

    // Constructor for Vehicle
    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display details (Overridden in subclasses)
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }
}

// Subclass: Car (Extends Vehicle)
class Car extends Vehicle {
    protected int seatingCapacity;
    protected String fuelType;

    // Constructor for Car (Uses constructor chaining)
    public Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price); // Calling superclass constructor
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    // Overriding displayDetails() for Car
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling parent class method
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass: ElectricCar (Extends Car)
class ElectricCar extends Car {
    private int batteryCapacity; // in kWh
    private double chargingTime; // in hours

    // Constructor for ElectricCar (Uses constructor chaining)
    public ElectricCar(String brand, String model, double price, int seatingCapacity, int batteryCapacity, double chargingTime) {
        super(brand, model, price, seatingCapacity, "Electric"); // Calls Car constructor
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    // Overriding displayDetails() for ElectricCar
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

// Subclass: Motorcycle (Extends Vehicle)
class Motorcycle extends Vehicle {
    private int engineCapacity; // in cc
    private String type; // e.g., Sport, Cruiser

    // Constructor for Motorcycle
    public Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price); // Calls Vehicle constructor
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    // Overriding displayDetails() for Motorcycle
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Type: " + type);
    }
}

// Main Class to Test the Program
public class App6 {
    public static void main(String[] args) {
        // Creating a Car object
        Car car1 = new Car("Toyota", "Camry", 3500000, 5, "Petrol");
        System.out.println("\nCar Details:");
        car1.displayDetails();

        // Creating an ElectricCar object
        ElectricCar eCar1 = new ElectricCar("Tesla", "Model 3", 5500000, 5, 75, 6.5);
        System.out.println("\nElectric Car Details:");
        eCar1.displayDetails();

        // Creating a Motorcycle object
        Motorcycle bike1 = new Motorcycle("Harley-Davidson", "Street 750", 600000, 750, "Cruiser");
        System.out.println("\nMotorcycle Details:");
        bike1.displayDetails();
    }
}
