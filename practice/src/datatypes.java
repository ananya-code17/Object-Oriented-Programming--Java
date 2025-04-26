public class datatypes {
    public static void main(String[] args){

        //primitive:
        //byte 1 [-128 to 127]
        //short 2
        //int 4 1,2,3
        //long 8 
        //float 4 3.14
        //double 8 
        //char 2 a,b,c,d
        //boolean 1 true/false
        byte age=30;
        age=31;

        float pi=3.14f;
        pi=1.1f;

        final float PI=3.14F; //can't change the value now 

        int phone=1234567890;
        long phone2=12345678900l; //l or L
        float p=3.14F; //f or F
        char letter='a';
        boolean isadult=false;

        //non-primitive:
        String name="ananya";
        System.out.println(name.length()); //length function can only be used for non-primitive data types
        
        String str1="hello";/*Java internally checks if the string already 
                              exists in the string pool. If it does, the same reference is used, so no new object is created.*/                                                          
        String str2="hello";

        String str3=new String("hello"); /*Here, str1 and str2 are two different objects in memory, 
                                                   even though they contain the same value */
        String str4=new String("hello");
 
        String name1="delhi";
        String name2="mumbai";
        String name3=name1 + " and " + name2; //conactenate
        System.out.println(name3);

        System.out.println(name.charAt(0)); //charAt
        System.out.println(name.charAt(1));

        String name4=name.replace('a','b'); //replace
        System.out.println(name4);
        System.out.println(name); //no changes in the original string
                                  //strings in java are immutable
        
        String name5="ananya and idha";
        System.out.println(name5.substring(0,6)); //substring (beginindex,endindex+1)
        System.out.println(name5.substring(7,10));
        
        //widening conversion:
        int x=10;
        float y=x;
        System.out.println(x);
        System.out.println(y);

        float f=3.14f;
        double d=f;
        System.out.println(f);
        System.out.println(d);

        byte b=10;
        int i=b;
        System.out.println(b);
        System.out.println(i);
        
        //explicit conversion:
        double price=100.0;
        double FinalPrice=price+10;

        /*int p=100;
        int fp=p+18.0;  error*/

        float a=30.4f;
        int ii=(int) a;
        System.out.println(ii);

        byte jj=(byte) 300;  //output: 300%256=44
        System.out.println(jj);


        System.out.println(10.0/0.0);
        System.out.println(-10.0/0.0);
        System.out.println(0.0/0.0); 
        /*ii= 10/0; run-time error- ArithmeticException 
        System.out.println(ii);  
        System.out.println(0/0); ArithmeticException
        10.0/0.0 - +ve infinity
        -10.0/0.0 - -ve infinity
        0.0/0.0 - NaN(Not a Number)
        dd == Infinity; can't do this checking. can be checked by wrapper class*/
        
        double dd=10.0/0.0;
        System.out.println(Double.isInfinite(dd));
        System.out.println(Double.isNaN(dd));

        //cond statement: if, if-else, if-else if ladder, switch
        int j=300;
        if(j<100) //if
        {
            System.out.println("inside control block");
        }

        boolean F=false;
        
        boolean issunup=true;  //if-else
        if(issunup==true)
            System.out.println("day");
        else 
            System.out.println("night");


        if(j==300) //if
        {
            System.out.println("inside control block");
        }


        if(F){ //can give only boolean values or any condition 
               //if else-if ladder
            System.out.println("inside control block");
        }
        else if(10<20){
            System.out.println("inside else-f control block");
        }
       

        int marks=90; //if-else if ladder
        if(marks>80){
            System.out.println("topper");
        }
        else if(marks<80 && marks>=60){
            System.out.println("first");
        }
        else{
            System.out.println("second");
        }

        //switch statement:
        int day=3;
        switch (day) {
            case 1:
                System.out.println("monday");
                break; //if break is not there then all the following messages will be printed
            case 2:
                System.out.println("tue");                
                break;
            case 3:
                System.out.println("wed");
        
            default:
                System.out.println("invalid day");
                break; //optional
        }
       
        //iterative statements 
        //for:
        for(int z=0;z<5;z++){
            System.out.println("print loop="+z);
        }

        for(int n=1;n<=4;n++){
            System.out.println(n);
        }

        for(int g=100;g>=1;g--){
            System.out.println(g);
        }

    //while:
    int g=100;
    while(g>=1){
        System.out.println(i);
         g=g-1; //or g--;
    }

    //do-while:
    int k=100;
    do{
        System.out.println(k);
        k--;
    }while(k>=1);

    //break & continue statement:
    int gg=0; //break
    while(true){
        System.out.println(gg);
        gg++;
        if(gg>5){
            break;
        }
    }

    int ff=0;
    while(true){
        if(i==3){
            i=i+1;
            continue; //further statements will be skipped 
        }
        System.out.println(i);
        ff++;
        if(ff>5){
            break;
        }
    }

    // Loop from 1 to 20 using binary numbers:
    for (int mm = 1; mm <= 20; mm++) {
        // Check if the number is even using binary AND operator
        if ((mm & 1) == 0) { // Binary AND with 1 checks the least significant bit
            continue; // Skip even numbers
            //In binary, odd numbers have 1 as the LSB.
            //In binary, even numbers have 0 as the LSB.
        }
        // Print the odd number in binary format
        System.out.println("Decimal: " + mm + " | Binary: " + Integer.toBinaryString(mm));
    }

    // Loop from 1 to 20 using hexadecimal numbers:
    for (int mm = 1; mm <= 20; mm++) {
        // Check if the number is even using binary AND operator
        if ((mm & 1) == 0) { // Binary AND with 1 checks the least significant bit
            continue; // Skip even numbers
            //In binary, odd numbers have 1 as the LSB.
            //In binary, even numbers have 0 as the LSB.
        }
        // Print the odd number in binary format
        System.out.println("Decimal: " + mm + " | Hexadecimal: " + Integer.toHexString(mm));
    }
        

    //int lll:
    int lll;
    for(lll=0; lll<5;lll++){
        System.out.println(lll);
    }
    

    //labeled break:
    boolean t=true;
    label1: {
        label2:{
            System.out.println("label 2");
            label3:{
                System.out.println("in label 3");
                break label2;
            }
            //System.out.println("this wont be printed");
        }
        System.out.println("exited label 2");
    }


    //continue outer: for nested loop
    // Label the outer loop as 'outer'
    outer:
    for (int xx = 1; xx <= 3; xx++) {
        for (int yy = 1; yy <= 3; yy++) {
            if (xx == yy) {
                System.out.println("Breaking to outer loop when xx = " + xx + ", yy = " + yy);
                continue outer; // Skip the rest of the inner loop and go to the next iteration of the outer loop
            }
            System.out.println("xx = " + xx + ", yy = " + yy);
        }
    }

    //break outer:
    // Label the outer loop as 'outer'
    outer:
    for (int xx = 1; xx <= 3; xx++) {
        for (int yy = 1; yy <= 3; yy++) {
            if (xx == yy) {
                System.out.println("Breaking to outer loop when xx = " + xx + ", yy = " + yy);
                break outer; // Breaks out of both the inner and outer loops
            }
            System.out.println("xx = " + xx + ", yy = " + yy);
        }
    }
    }
}


