
import java.util.Scanner;
public class input {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enetr 1st number ");
    int a=sc.nextInt();
    System.out.println("enter 2nd number ");
    int b=sc.nextInt();
    int sum=a+b;
    System.out.println("sum= "+sum);

    boolean b1=sc.hasNextInt();
    System.out.println(b1);

    String str=sc.next();
    System.out.println(str);

    String str1=sc.nextLine();
    System.out.println(str1);

    
}
}
