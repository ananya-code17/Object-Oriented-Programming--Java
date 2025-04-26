public class App1 {
    public static int sumInteger() {
        int totalSum = 0;
        for (int num = 10; num <= 950; num++) {
            if (num % 6 == 0 && num % 9 == 0) {
                totalSum += num;
            }
        }
        return totalSum;
    }
    public static void main(String[] args) {
        int result = sumInteger();
        System.out.println("sum: " + result);
    }
}