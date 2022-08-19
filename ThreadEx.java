public class ThreadEx extends Thread {
    public void run(){
        System.out.println("thred is running");
        for(int i=1;i<=10;i++){
            System.out.print(i);
        }
    }
        public static void main(String[] args){
               ThreadEx t = new ThreadEx();
               t.start();
               

        }
    }

