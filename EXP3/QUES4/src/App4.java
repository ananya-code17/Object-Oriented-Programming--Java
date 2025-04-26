public class App4 {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i < num; i++) { // Check divisors from 2 to num-1
            if (num % i == 0) {
                return false; // If divisible, it's not prime
            }
        }
        return true; // The number is prime
    }

    public static void main(String[] args) {
        int count = 0;
        System.out.println("Prime numbers between 1 and 1000 are:");
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " "); // Display the prime number
                count++;
            } 
        }

        System.out.println("\nTotal number of prime numbers between 1 and 1000: " + count);
    }
} 