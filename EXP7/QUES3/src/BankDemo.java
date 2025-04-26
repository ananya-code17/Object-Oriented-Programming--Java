// Bank.java (Interface)
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

// Account.java (Implements Bank)
class Account implements Bank {
    private double balance;

    // Constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// BankDemo.java (Main class)
public class BankDemo {
    public static void main(String[] args) {
        // Creating an account with an initial balance of $1000
        Account myAccount = new Account(1000);

        // Performing deposit and withdrawal operations
        myAccount.deposit(500);
        myAccount.withdraw(200);
        myAccount.withdraw(1500); // Should display an insufficient balance message

        // Display final balance
        myAccount.displayBalance();
    }
}
