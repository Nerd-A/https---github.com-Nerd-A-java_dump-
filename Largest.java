import java.util.*;
public class Largest {
    static void largest(int a, int b, int c){
        if(a>b && a>c)
        System.out.println(a);
        else if(b>a && b>c)
        System.out.println(b);
        else if(c>a && c>b)
        System.out.println(c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        largest(a,b,c);
        sc.close();
    }
}
