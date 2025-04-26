public class App7{
    public static String Grade(double average) {
        if (average >= 90) {
            return "Grade A";
        } 
        else if (average >= 75) {
            return "Grade B";
        } 
        else if (average >= 50) {
            return "Grade C";
        } 
        else {
            return "Grade F";
        }
    }
    public static void main(String[] args) {
        int s1 = 85;
        int s2 = 78;
        int s3 = 92;
        double average = s1+s2+s3/3.0;
        String grade = Grade(average);
        System.out.println("The final grade: " + grade);
    }
}

