public class App4 {
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } 
        else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } 
        else {
            System.out.println("The number is zero.");
        }
    }
    public static void main(String[] args) {
        checkNumber(-3);
    }
}
