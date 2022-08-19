 class multi {
 synchronized void Compute (int n){
        for(int i=0;i<=3; i++){
           System.out.println(n*i);
        }
    }
}

class thread1 extends Thread{
    multi t;
    thread1(multi t)// constructor
    {
        this.t=t;
    }
    public void run(){
        t.Compute(4);
    }
}
class thread2 extends Thread{
    multi t;
    thread2(multi t)  // constructor
    {
        this.t=t;
    }
    public void run(){
        t.Compute(40);
    }
}
public class Sync{
    public static void main(String[] args){
        multi m = new multi();
        thread1 t1= new thread1(m);
        thread2 t2 = new thread2(m);
        t1.start();
        t2.start();
    }
}
