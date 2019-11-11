package exceptionsfiles;

public class Demo {
    public static void main(String[] args){
        System.out.println("program starts");
        doMath(12,0);
        System.out.println("program continues");
    }
    public static void doMath(int a, int b) {
       answer(a,b);
    }
    public static double answer(int x, int y){
        //catch the error here
        return x/y;
    }
}
