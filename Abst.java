import java.util.*;
abstract class Add{
    abstract void Addition(int x,int y);
}
class Sum extends Add{
    void Addition(int x,int y){
         int s=x+y;
         System.out.println(s);
    }
class Abst{
    public static void main(String[] args){
        Sum a = new Sum();
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        a.Addition(x,y);
        
    }
}

   

    
}