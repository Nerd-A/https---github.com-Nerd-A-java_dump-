import java.util.Scanner;
public class factorial{

    public static int fac(int x){
        
         if(x==0)
         {
             return 1;
         }
         else 
        {
             int y = fac(x-1)*x;
             return y;
        }
         }
    public static void main(String[] arg)
    {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println(fac(a));
        sc.close();
    }

    

}