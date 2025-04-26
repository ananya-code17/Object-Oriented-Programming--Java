public class App9 {
    public static int findMissingNumber(int[] array, int n) {
        // Calculate the expected sum of numbers from 1 to N
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of the elements in the array
        int actualSum = 0;
        for (int i=0;i<array.length;i++) {
            actualSum += array[i];
        }

        // The missing number is the difference between expected and actual sum
        return expectedSum - actualSum;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 5, 6, 2, 4};
        int n = 6; // Total numbers in the range (1 to N)
        int missingNumber = findMissingNumber(array, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}
