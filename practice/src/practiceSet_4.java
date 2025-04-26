import java.util.Scanner;
public class practiceSet_4 {
    public static void main(String[] args) {
        //1st ques:
        /*int a=10;
        if(a=11){   //--error--
            System.out.println("i am 11");
        }else{
            System.out.println("i am not 11");
        }*/

        //2nd ques:
        Scanner sc=new Scanner(System.in);
        float s1=sc.nextFloat();
        float s2=sc.nextFloat();
        float s3=sc.nextFloat();
        float total=s1+s2+s3;
        if(s1>33 && s2>33 && s3>33){
            if(total>40)
                System.out.println("the student is pass");
            else
                System.out.println("the student is failed due to insufficient total marks");
        }
        else{
            System.out.println("the student is fail due to insufficient 33% marks");
        }

        //3rd ques:
        System.out.println("enter income in lakhs: ");
        double income=sc.nextDouble();
        double tax=0;
        if(income<2.5){
            tax=0;
        }else if(income >=2.5 && income <=5.0){
            tax=income*0.05;
        }else if(income >=5.0 && income <=10.0){
            tax=income*0.20;
        }else{
            tax=income*0.30;
        }
        System.out.println("tax paid= "+tax+"lakhs");
        sc.close();
    }
    
}
