/*class Calculator { //This class contains three overloaded methods, all named add
    // Method to add two numbers: method-1
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three numbers: method-2
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with different parameter types: method-3
    public double add(double a, double b) {
        return a + b;
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));         // Calls method-1 with 2 int parameters
        System.out.println(calc.add(10, 20, 30));    // Calls method-2 with 3 int parameters
        System.out.println(calc.add(5.5, 4.5));      // Calls method-3 with 2 double parameters
    }
}*/


/*class addition {
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }
}
public class methodOverloading{
    public static void main(String[] args){
        addition calc=new addition();
        System.out.println(calc.sum(4,5));
        System.out.println(calc.sum(4,5,6));
    }
}*/


class SumExample {
    public int sum(int a, int b) {
        return a + b;
    }
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Method to calculate sum using variable arguments (varargs)
    public int sum(int... arr) {  //variable args
        if (arr.length == 0) {  // Check if no arguments are passed
            throw new IllegalArgumentException("At least one argument is required");
        }  
        int sum = 0;
        for (int a : arr) { //for a in arr
            sum += a;
        }
        return sum;
    }
}

public class methodOverloading{
    public static void main(String[] args) {
        SumExample example = new SumExample();
        System.out.println("Sum of 2 numbers: " + example.sum(10, 20));
        System.out.println("Sum of 3 numbers: " + example.sum(10, 20, 30));
        System.out.println("Sum of multiple numbers using varargs: " + example.sum(10, 20, 30, 40, 50));
    }
}


