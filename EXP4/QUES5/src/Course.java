public class Course {

    // Class attributes 
    String courseName;
    String courseCode;

    // Constructor to initialize the course details
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }

    public static void main(String[] args) {
        // Creating an object of the Course class
        Course course1 = new Course("OOPS", "CSEG2020_3");

        // Displaying the course details
        course1.displayCourseDetails();
    }
}
