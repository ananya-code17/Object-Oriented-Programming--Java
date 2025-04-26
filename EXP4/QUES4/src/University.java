public class University {

    // Static variable (shared by all instances)
    static String universityName = "UPES, Dehradun";

    // Non-static variable (unique for each instance)
    String studentName; 

    // Constructor to initialize the studentName
    public University(String studentName) {
        this.studentName = studentName;
    }

    // Static method to display the university name
    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    // Method to display the student name
    public void displayStudentName() {
        System.out.println("Student Name: " + studentName);
    }

    public static void main(String[] args) {
        // Create multiple student objects
        University student1 = new University("Ananya");
        University student2 = new University("Mihika");
        University student3 = new University("Shreya");

        // Demonstrate static method for university name
        University.displayUniversityName();

        // Demonstrate non-static variable for student names
        student1.displayStudentName();
        student2.displayStudentName();
        student3.displayStudentName();
    }
}
