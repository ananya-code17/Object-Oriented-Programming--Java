public class App10 {
    public static void main(String[] args) {
        // Example input array and number of positions to rotate
        int[] arr = {1, 2, 3, 4, 5};
        int K = 2;

        // Call the function to rotate the array
        rotateArray(arr, K);

        // Display the rotated array
        System.out.print("Rotated Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Function to rotate the array right by K positions
    public static void rotateArray(int[] array, int K) {
        int n = array.length;

        // Ensure K is within bounds (if K >= n, rotate only K % n times)
        K = K % n;

        // Reverse the entire array
        reverseArray(array, 0, n - 1);

        // Reverse the first K elements
        reverseArray(array, 0, K - 1);

        // Reverse the remaining elements
        reverseArray(array, K, n - 1);
    }

    // Helper function to reverse a portion of the array
    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            // Swap elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the pointers
            start++;
            end--;
        }
    }
}