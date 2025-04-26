public class App2{
    public static double si(double principal, double rate, double time){
        double s_interest=(principal*rate*time)/100;
        return s_interest;
    }
    public static void main(String[] args){
        double p=1000, r=10, t=2;
        double s_interest=si(p,r,t);
        System.out.println("simple interest=" + s_interest);
    }
}