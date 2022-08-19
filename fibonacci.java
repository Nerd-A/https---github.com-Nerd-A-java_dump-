import java.util.Scanner;
public class fibonacci{
    public static void fibo(int x)
    {
         int a=0 , b=1,sum=0;
         while(b<=x)
         {
             sum = a + b;
             a=b;
             b=sum;
             System.out.println(sum);
         }
    }
    public static void main(String [] arg)
    {
         Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        fibo(n);
        sc.close();
    }
}
