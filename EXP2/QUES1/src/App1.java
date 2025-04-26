public class App1 {
    public static double Area(int a, int b){
    double ar=0.5*a*b;
    return ar;
   }
   public static void main(String args[]){
       int i=4,j=8;
       
       double t= Area(i,j);
       System.out.println("area=" + t);
}
}
