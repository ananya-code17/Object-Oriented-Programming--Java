public class classsObjects { //we dont need a constructor here becasue a and b are already initialized 
    /*int a = 10;
    String b = "ananya";

    void show() { //method which tells the function the object has to perform 
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        classsObjects r = new classsObjects();  //r is an object of class classsObjects
        r.show();*/

        int a;
        String b;

        public classsObjects(){
            a=10;
            b="ananya";
        }
        void show(){
            System.out.println(a+" "+b);
        }
        public static void main(String[] args) {
            classsObjects r=new classsObjects();
            r.show();
        }
        
    }

