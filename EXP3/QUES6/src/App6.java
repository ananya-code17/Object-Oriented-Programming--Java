public class App6 {
    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            return -1; // Indicates an error
        }
        int largest = array[0];
        int secondLargest = -1; // Use -1 for uninitialized second largest

        // Traverse the array
        for (int i = 1; i < array.length; i++) { //starting from 1 since we have initialized 0th element already
            if (array[i] > largest) {
                secondLargest = largest;  //now largest becomes new secondlargest
                largest = array[i];  //we got new largest element 
            } else if (array[i] > secondLargest && array[i] != largest) { 
                //checks if the current element is greater than the current value of secondLargest
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        int secondLargest = findSecondLargest(numbers);
        System.out.println("The second largest element is: " + secondLargest);
    }
} 