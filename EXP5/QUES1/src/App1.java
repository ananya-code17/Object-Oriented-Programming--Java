class Parent {   //superclass
    private String secretMessage = "This is a private message"; // Private member

    // Public method to access private member
    public String getSecretMessage() {
        return secretMessage;
    }
}

// Subclass
class Child extends Parent {
    public void showMessage() {
        // Trying to access secretMessage directly (will cause error)
        // System.out.println(secretMessage); //Not allowed

        // Accessing using a public method (Allowed)
        System.out.println("Accessing through function: " + getSecretMessage());
    }
}

// Main class
public class App1 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showMessage();
    }
} 