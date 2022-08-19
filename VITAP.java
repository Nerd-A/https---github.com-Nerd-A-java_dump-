class VIT extends Thread{
  public  void run(){
        for(int i=0;i<4;i++){
            System.out.println("VIT");
            try{
                Thread.sleep(1000);

            }
            catch(Exception e){}
        }

    }
}

class AP extends Thread{
    public void run(){
        for(int i=0;i<4;i++){
            System.out.println("AP");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }

    }
}
public class VITAP{
    public static void main(String[] args){
        VIT v = new VIT();
        AP a = new AP();
        v.start();
        a.start();
    }
}