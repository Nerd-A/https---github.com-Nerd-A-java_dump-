import java.util.*;
public class que2{
   static Scanner sc = new Scanner (System.in);
    public static long cal(long x, long y ,long z){
        long sum = x + y + z;
        return sum;

    }
    public static long div(long x)throws ArithmeticException{
        System.out.println("divisor");
         long q=sc.nextLong();
         long a=x/q;
         return a;
    }
    public static void main(String[] args){
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = cal(a,b,c);
        System.out.println( "sum " + d);
        try{
            System.out.println(div(d));
            
        }
        catch (ArithmeticException e){
           System.out.println("Cannot Divide it with Zero");
        }
        
    }
}