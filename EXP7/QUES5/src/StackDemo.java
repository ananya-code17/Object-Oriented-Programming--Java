import java.util.Scanner;

// Interface defining stack operations
interface StackInterface {
    void push(int value);
    void pop();
    void display();
}

// Class implementing StackInterface
class StackClass implements StackInterface {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize stack
    public StackClass(int size) {
        this.capacity = size;
        this.stack = new int[size];
        this.top = -1;
    }

    // Push operation
    @Override
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println("Pushed " + value + " onto the stack.");
        }
    }

    // Pop operation
    @Override
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop."); // Return an invalid value to indicate underflow
        } else {
            int poppedValue = stack[top--];
            System.out.println("Popped " + poppedValue + " from the stack.");
        }
    }

    // Display stack contents
    @Override
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackDemo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = scanner.nextInt();
        StackClass stack = new StackClass(size);

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display Stack");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        }
    }
}
