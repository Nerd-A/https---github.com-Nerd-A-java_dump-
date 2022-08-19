import java.util.*;
public class base {
    public static void binary(int x){
        int y =0;
        if(x>0){
            y=x%2;
            
            binary(x/2);
            System.out.print(y);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a= sc.nextInt();
        binary(a);
        sc.close();
    }
}
