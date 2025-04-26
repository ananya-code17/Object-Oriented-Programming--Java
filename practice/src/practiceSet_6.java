import java.util.Scanner;
public class practiceSet_6 {
    public static void main(String[] args) {
        int [] marks = new int[5]; //declaration + memory allocation
        marks[0]=40;
        marks[1]=90;
        marks[2]=80;
        marks[3]=45;
        marks[4]=68;
        //int [] marks={40,90,80,45,68};  --declaration + initialize
        System.out.println(marks[4]);
        marks[4]=86;
        System.out.println(marks[4]);
        //System.out.println(marks[5]); --error--
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        //1st ques:
        Scanner sc=new Scanner(System.in);
        float [] num=new float[5];
        float sum=0;
        System.out.println("enter number");
        for(int i=0; i<num.length;i++){
            System.out.println("enter number:"+(i+1) + ":");
            num[i]=sc.nextFloat();
        }

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);

        //2nd ques:
        float searchNum=sc.nextFloat();
        for(int x=0;x<num.length;x++){
            if(num[x]==searchNum){
                System.out.println("the given element is present");
            } else{
                System.out.println("not present");
            }

        //3rd ques:
        int [] mark={85,90,78,92,88};
        int sum1=0;
        double avg=0;
        for(int y:mark){
            sum1+=y;
        }
        avg=(double)sum1/5;
        System.out.println(avg);
        }

        //4th ques:
        int [] [] m1={{1,2,3},{4,5,6}};
        int [] [] m2={{7,8,9},{10,11,12}};
        int [] [] result= new int[2][3];
        for(int u=0;u<2;u++){
            for(int v=0;v<3;v++){
                result[u][v]=m1[u][v]+m2[u][v];
            }
        }
        for(int u=0;u<2;u++){
            for(int v=0;v<3;v++){
                System.out.println(result[u][v]+" ");
            }
            System.out.println();
        }

        //6th ques:
        int [] number={23,45,12,56,78,34};
        int max=number[0];
        for(int t=1;t<number.length;t++){
            if(number[t]>max){
                max=number[t];
            }
        }
        System.out.println("max element= "+max);
        
    }    
}
