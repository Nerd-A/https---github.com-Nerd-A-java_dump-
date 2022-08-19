import java.util.*;
class A1 extends Thread{
    int i,j;
    A1(int x,int y){
        i=x;
        j=y;

    }
    public void run(){
        System.out.println("Thread A :: Arithmatic Operation");
        System.out.println("Sum " +(i+j));
        System.out.println("Differnece " + (i-j));
        System.out.println("Ratio "+ (i/j));
        System.out.println("Product "+ Math.pow(i,j));
        System.out.println("End of A");
    }
}
class B1 extends Thread{
    int i;
    
    B1(int x){
        i=x;
    }
    public void run(){
        System.out.println("Thread B :: Trigonometry Operations");
        System.out.println("Sine of"+i+" "+ Math.sin(i));
        System.out.println("Cosine of"+i+" "+ Math.cos(i));
        System.out.println("Tan of "+ i +" "+ Math.tan(i));
        System.out.println("Square root of"+ i +" "+ Math.sqrt(i));
        System.out.println("End of B");
        
    }
}
class Operate{
    public static void main(String[] args){
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter the value for arithmetic operations");
      int x = sc.nextInt();
      int y = sc.nextInt();
      System.out.println("Enter the value for the trignometric operations");
      int z = sc.nextInt();
      A1 A = new A1(x,y);
      B1 B = new B1(z);
      A.run();
      B.run();
      sc.close();

      
      
      
    }
 
}
