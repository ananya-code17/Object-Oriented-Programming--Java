import Balance.Account; // Importing the Account class from the Balance package

public class account {
    public static void main(String[] args) {
        // Creating an Account object with an initial balance
        Account myAccount = new Account(5000.75);
        
        // Calling the Display_Balance method
        myAccount.Display_Balance();
    }
}
