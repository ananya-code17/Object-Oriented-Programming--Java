// Superclass: Employee
class Employee {
    private String name;
    private int empid; 
    private double salary;

    //Default Constructor
    public Employee() {
        this.name = "Unknown";
       this.empid = 0;
        this.salary = 0.0;
    }

    // Parameterized Constructor
    //public Employee(String name, int empid, double salary) {
        //this.name = name;
        //this.empid = empid;
        //this.salary = salary;
    //}

    public Employee(Employee emp1){
        emp1.name="ananya";
        emp1.empid=500122866;
    } 


    // Method to return employee name
    public String getName() {
        return name;
    }

    // Method to return employee salary
    public double getSalary() {
        return salary;
    }

    // Method to increase salary
    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
            System.out.println(name + "'s new salary after " + percentage + "% increase: ₹" + salary);
        } else {
            System.out.println("Invalid percentage! Salary remains ₹" + salary);
        }
    }
}

// Subclass: Manager
class Manager extends Employee {
    private String department;

    // Parameterized Constructor
    public Manager(String name, int empid, double salary, String department) {
        //super(name, empid, salary); // Call superclass constructor
        this.department = department;
    }

    // Method to display manager details (Only Name & Salary as per question)
    public void displayDetails() {
        System.out.println("Manager Name: " + getName());
        System.out.println("Salary: ₹" + getSalary());
    }
}

// Main Class
public class App5 {
    public static void main(String[] args) {
        // Creating Employee object using parameterized constructor
        //Employee emp1 = new Employee("John Doe", 101, 50000);
        //System.out.println(emp1.getName() + "'s Salary: ₹" + emp1.getSalary());
        //emp1.increaseSalary(10); // Increase salary by 10%
        System.out.println();
        Employee emp1=new Employee();
        // Creating Manager object
        Manager mgr1 = new Manager("Alice Smith", 201, 75000, "IT");
        mgr1.displayDetails();
        mgr1.increaseSalary(15); // Increase salary by 15%
    }
}
