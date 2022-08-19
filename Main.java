public class Main {
    public Main(int x){
        System.out.println("I am a constructor!"+x);
    }
    public static void main (String[] arg){
       try{
           int x = 30/0;
           System.out.println(x);
       }
       catch(ArithmeticException e){
           int x = 30/2;
           System.out.println(x);

       }
       Main OBJ1 = new Main(1000);
       OBJ1.close();


    }
    public void close(){}
}
