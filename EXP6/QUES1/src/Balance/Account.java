package Balance; // Package declaration

public class Account {
    private double balance; // Private variable to store account balance

    // Constructor to initialize balance
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to display the balance
    public void Display_Balance() {
        System.out.println("Account Balance: ₹" + balance);
    }
}

