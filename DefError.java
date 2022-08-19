import java.util.Scanner;
public class DefError {
    public static int Area(int l,int b) throws Exception{
        if(l<0 || b<0)
            throw new  Exception("Inveid dimention");
        else
        return l*b;

        
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int bre = sc.nextInt();
        try{
            System.out.println(Area(len,bre));
        }
     catch (Exception e){
         System.out.print(e);
     }
     sc.close();
    }
}
