class Student {
    String name;  //instance variables 
    int age;

    // Default constructor: for initialization
    public Student() {
        this.name ="Ananya";
        this.age = 20;
    }

    // Parameterized constructor: for user defined values
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating object using default constructor
        Student student1 = new Student();
        student1.display();

        // Creating object using parameterized constructor
        Student student2 = new Student("Mihika", 21);
        student2.display();
    } 
}