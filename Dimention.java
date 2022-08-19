import java.util.Scanner;
public class Dimention {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len= sc.nextInt();
        int bre=sc.nextInt();
        int Area=len*bre;
        int Perimeter=2*(len+bre);
        System.out.println("Area="+Area);
        System.out.println("Perimeter="+Perimeter);
        sc.close();
    }
}
