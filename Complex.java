import java.util.*;
public class Complex {
    static void Add(int x1, int x2, int y1, int y2){
          int X = x1+x2;
          int Y = y1+y2;
          System.out.println(X+"+i"+Y);
    }
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int x1 = sc.nextInt();
      int y1 =  sc.nextInt();
      int x2 = sc.nextInt();
      int y2 = sc.nextInt();
    Add(x1,x2,y1,y2);
    sc.close();
  }
}
