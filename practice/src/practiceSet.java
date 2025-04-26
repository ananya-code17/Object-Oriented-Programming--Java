import java.util.Scanner;
public class practiceSet {
    public static void main(String[] args) {
        //1st ques:
        float a=10f;
        int b=20;
        int c=40;
        float sum=a+b+c;
        System.out.println(sum);

        //2nd ques:
        Scanner sc=new Scanner(System.in);
        float s1=sc.nextFloat();
        float s2=sc.nextFloat();
        float s3=sc.nextFloat();
        float cgpa=(s1+s2+s3)/3;
        System.out.println("cgpa= "+cgpa);

        //4th ques:
        double km=sc.nextDouble();
        double miles=km*0.621371;
        System.out.println(km+"kilometers is equal to"+miles+"miles");
        
        //5th ques:
        if(sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println("the entered no. is integer"+n);
        }
        else{
            System.out.println("the entered no. is not an integer");
        }

        }


    }


