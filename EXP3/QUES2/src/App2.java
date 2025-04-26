import java.util.Scanner;
public class App2 {
    public static int sumInt() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        while (num != 0) {
            sum += num % 10; 
            num/= 10;       
        }
        scanner.close();
        return sum;
    }
    
    public static void main(String[] args) {
        int result = sumInt();
        System.out.println("The sum of the digits is: " + result);
    }
}
