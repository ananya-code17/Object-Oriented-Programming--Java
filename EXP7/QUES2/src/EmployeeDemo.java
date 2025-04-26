// Abstract class Employee
abstract class Employee {
    protected String name;
    protected String role;
    
    // Constructor
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Abstract methods
    abstract void calculateSalary();
    abstract void displayDetails();
}

// Manager class extending Employee
class Manager extends Employee {
    private double fixedSalary;

    // Constructor
    public Manager(String name, double fixedSalary) {
        super(name, "Manager");
        this.fixedSalary = fixedSalary;
    }

    // Implementing abstract methods
    @Override
    void calculateSalary() {
        System.out.println("Manager's Salary: $" + fixedSalary);
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name + ", Role: " + role + ", Salary: $" + fixedSalary);
    }
}

// Developer class extending Employee
class Developer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public Developer(String name, double hourlyRate, int hoursWorked) {
        super(name, "Developer");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementing abstract methods
    @Override
    void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Developer's Salary: $" + salary);
    }

    @Override
    void displayDetails() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Name: " + name + ", Role: " + role + ", Salary: $" + salary);
    }
}

// Main class
public class EmployeeDemo {
    public static void main(String[] args) {
        // Creating Manager object
        Employee manager = new Manager("Alice", 5000);
        manager.displayDetails();
        manager.calculateSalary();

        System.out.println();

        // Creating Developer object
        Employee developer = new Developer("Bob", 50, 160);
        developer.displayDetails();
        developer.calculateSalary();
    }
}
