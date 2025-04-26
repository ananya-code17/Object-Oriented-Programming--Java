public class App7 {
    public static void main(String[] args) {
        int totalLines = 5; 
        for (int i = 1; i <= totalLines; i++) {
            // Check if the current line is odd or even
            if (i % 2 != 0) {
                // Odd lines: Print '?'
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("? ");
                }
            } else {
                // Even lines: Print '#'
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
} 