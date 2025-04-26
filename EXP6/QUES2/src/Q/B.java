package Q; // Declare package Q

import p.A; // Import class A from package p

public class B {
    public static void main(String[] args) {
        A obj = new A();

        // Public method is accessible
        obj.publicMethod(); 

        // Protected method is NOT accessible (unless B extends A)
        // obj.protectedMethod(); // ERROR

        // Default method is NOT accessible (package-private restriction)
        // obj.defaultMethod(); // ERROR

        // Private method is NEVER accessible outside class A
        // obj.privateMethod(); // ERROR

        // Indirectly accessing private method via a public method
        obj.testPrivateMethod();
    }
}
