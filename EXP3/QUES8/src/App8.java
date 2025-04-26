public class App8{
    public static void main(String[] args) {
        int[] sourceArray = {10, 20, 30, 40, 50};
        int[] destinationArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }

        System.out.println("Elements in the destination array:");
        for (int i = 0; i < destinationArray.length; i++) {
            System.out.print(destinationArray[i] + " ");
        }        
    }
}
