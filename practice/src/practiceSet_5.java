import java.util.Scanner;
public class practiceSet_5 {
    public static void main(String[] args) {
       //2nd ques:
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int sum=0;
       int i=0;
       int number=2;
       while(i<n){
        if(number%2==0){
            sum+=number;
            i++;
        }
        System.out.println(sum);
       }

       //3rd ques:
       int x=sc.nextInt();
       for(int y=1;y<=10;y++){
        System.out.println(x*y);
       }

       //4th ques:
       int a=10;
       for(int y=10;y>=1;y--){
        System.out.println(a*y);
       }

       //5th ques:
       long f=1;
       int u;
       int c=sc.nextInt();
       if(c<0){
        System.out.println("Factorial is not defined for negative numbers.");
       }else{
       for(u=c;u>=1;u--){
        f=f*u;
       }
       System.out.println("fact= "+f);
    }

    //6th ques:
    /*long f=1;
    int u;
    int c=sc.nextInt();
    if(c<0){
        System.out.println("Factorial is not defined for negative numbers.");
    }else{
    u=c;
    while(u>=1){
        f=f*u;
        u--;
    }
    System.out.println("fact= "+f);
}*/

    //9th ques:
    int sum1=0;
    int m=1;
    for(int ii=1;i<=10;i++){
        m=8*ii;
        sum1+=m;
    }
    System.out.println(sum1);

    //11th ques:
    int nn=sc.nextInt();
    int num2=2;
    int sum2=0;
    for(int xx=1;xx<nn;xx++){
        if(num2%2==0){
            sum2+=num2;
            num2++;
        }
    }
    System.out.println(sum2);
}
}
