package p; // Declare package p

public class A {
    // Public method - accessible everywhere
    public void publicMethod() {
        System.out.println("Public method called!");
    }

    // Protected method - accessible in same package & subclasses
    protected void protectedMethod() {
        System.out.println("Protected method called!");
    }

    // Default (package-private) method - accessible only within package p
    void defaultMethod() {
        System.out.println("Default method called!");
    }

    // Private method - accessible only within class A
    private void privateMethod() {
        System.out.println("Private method called!");
    }

    // Public method to call privateMethod() (for testing)
    public void testPrivateMethod() {
        privateMethod();
    }
}
