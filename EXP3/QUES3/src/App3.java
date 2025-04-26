import java.util.Scanner;
public class App3{
    public static void printFibonacci() {
        int first = 0, second = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second; 
            first = second;
            second = next;
        }
        scanner.close();
    }

    public static void main(String[] args) {
        printFibonacci();
    }
}


