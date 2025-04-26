class Person {  //base class
    protected String name;
    protected int age;
    protected String address;

    // Constructor for Person
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display details (Overridden in subclasses)
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

// Subclass: Staff (Extends Person)
class Staff extends Person {
    protected String staffId;
    protected String department;

    // Constructor for Staff (Uses constructor chaining)
    public Staff(String name, int age, String address, String staffId, String department) {
        super(name, age, address); // Calling superclass constructor
        this.staffId = staffId;
        this.department = department;
    }

    // Overriding displayDetails() for Staff
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling parent class method
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }
}

// Subclass: Professor (Extends Staff)
class Professor extends Staff {
    private String specialization;

    // Constructor for Professor (Uses constructor chaining)
    public Professor(String name, int age, String address, String staffId, String department, String specialization) {
        super(name, age, address, staffId, department); // Calls Staff constructor
        this.specialization = specialization;
    }

    // Method for Professor to conduct a lecture
    public void conductLecture() {
        System.out.println(name + " is conducting a lecture on " + specialization + ".");
    }

    // Overriding displayDetails() for Professor
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}

// Subclass: Student (Extends Person)
class Student extends Person {
    private String studentId;
    private String course;

    // Constructor for Student
    public Student(String name, int age, String address, String studentId, String course) {
        super(name, age, address); // Calls Person constructor
        this.studentId = studentId;
        this.course = course;
    }

    // Overriding displayDetails() for Student
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

// Main Class to Test the Program
public class App7 {
    public static void main(String[] args) {
        // Creating a Staff object
        Staff staff1 = new Staff("Aman", 40, "Dehradun", "STF101", "Administration");
        System.out.println("\nStaff Details:");
        staff1.displayDetails();

        // Creating a Professor object
        Professor prof1 = new Professor("Dr. Rahul", 45, "Dehradun", "PROF202", "Computer Science", "Machine Learning");
        System.out.println("\nProfessor Details:");
        prof1.displayDetails();
        prof1.conductLecture(); // Conducting a lecture

        // Creating a Student object
        Student student1 = new Student("Ananya Joshi", 19, "Haridwar", "STD303", "B.Tech CSE");
        System.out.println("\nStudent Details:");
        student1.displayDetails();
    }
}