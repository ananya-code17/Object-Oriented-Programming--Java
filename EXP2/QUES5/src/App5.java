public class App5 {
    public static void Greatest(int x, int y, int z) {
        if (x>=y) {
            if (x>=z) {
                System.out.println(x + " is the greatest number.");
            } else {
                System.out.println(z+ " is the greatest number.");
            }
        } else {
            if (y>=z) {
                System.out.println(y + " is the greatest number.");
            } else {
                System.out.println(z + " is the greatest number.");
            }
        }
    }
    public static void main(String[] args) {
        int x=10;
        int y=25;
        int z=15;
        Greatest(x,y,z);
    }
}

