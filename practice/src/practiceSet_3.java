import java.util.Scanner;
public class practiceSet_3 {
    public static void main(String[] args) {
        String name="ananya";
        int a=10;
        System.out.print(name); //no new line at the end 
        System.out.println(name); //new line at the end 
        System.out.printf("%s",name);
        System.out.println();

        String x="    ananya    ";
        System.out.println(x.trim());

        String y="ananya";
        System.out.println(y.substring(3));
        System.out.println(y.substring(1,6));

        System.out.println(y.replace('a','b'));

        System.out.println(y.startsWith("ya")); //boolean function
        System.out.println(y.endsWith("ya"));
        System.out.println(y.charAt(2));
        System.out.println(y.indexOf('a'));
        System.out.println(y.indexOf('a',1));
        System.out.println(y.equals("ananya"));
        System.out.println(y.equalsIgnoreCase("ANANYA"));
        System.out.println(y.lastIndexOf('a'));
        System.out.println(y.lastIndexOf("an"));
        System.out.println(y.lastIndexOf("an",1));

        //4th ques:
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.contains("  ")){
            System.out.println("the string contains double spaces");
        }else if(str.contains("   ")){
            System.out.println("the string contains triple spaces");
        }else{
            System.out.println("the string contains single or no sapces ");
        }
    }    
}
