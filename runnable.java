public class runnable implements Runnable {
 public void run(){
     
   System.out.println("Runnable interface");}
 

 public static void main(String[] args){
     Runnable r = new runnable();
     Thread a = new Thread(r);
       a.start();
 }
     
     

}
    


