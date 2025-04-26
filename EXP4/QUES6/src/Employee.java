public class Employee {

    // Instance variables (non-static)
    private int employeeId;
    private String employeeName;
    private String department;
    private double salary;

    // Static variable to track the total number of employees
    static int totalEmployees = 0;

    // Default constructor to initialize employee details with default values
    public Employee() {
        this.employeeId = 101;
        this.employeeName = "ABC";
        this.department = "CS";
        this.salary = 100000;
        totalEmployees++; // Increment total employees when a new employee is created
    }

    // Parameterized constructor to initialize employee details based on user input
    public Employee(int employeeId, String employeeName, String department, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        totalEmployees++; // Increment total employees when a new employee is created
    }

    // Method to calculate and return the salary of the employee
    public double calculateSalary() {
        return this.salary;
    }

    // Method to display all employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary); 
    }

    // Public method to access the private salary variable
    public double getSalary() {
        return this.salary;
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Number of Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        // Creating employee objects using both default and parameterized constructors
        Employee employee1 = new Employee();
        Employee employee2 = new Employee(102, "Alice", "HR", 50000.0);
        Employee employee3 = new Employee(103, "Bob", "IT", 60000.0);

        // Displaying total number of employees
        Employee.displayTotalEmployees();

        // Displaying employee details
        System.out.println("\nEmployee 1 Details:");
        employee1.displayEmployeeInfo();

        System.out.println("\nEmployee 2 Details:");
        employee2.displayEmployeeInfo();

        System.out.println("\nEmployee 3 Details:");
        employee3.displayEmployeeInfo();

        // Displaying the salary for employee 2 and employee 3 
        System.out.println("\nSalary of Employee 2: " + employee2.getSalary());
        System.out.println("Salary of Employee 3: " + employee3.getSalary());
    }
} 