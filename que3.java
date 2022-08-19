class Player<T,U>{
    T Name;
    U JerseyNo;

    public Player(T Name , U JerseyNo){
        this.Name  = Name;
        this.JerseyNo = JerseyNo;
    }

    public T GetName(){
        return Name;
    }

     public void SetName(T Name){
        this.Name = Name;
    }

    public U GetJerseyNo(){
        return JerseyNo;
    }

    public void SetJerseyNo(U JerseyNo){
        this.JerseyNo = JerseyNo;
    }
   public String toString(){
       return  JerseyNo+" "+Name;
   }
}

public class que3{
    public static void main(String[] args){
        Player<String,Integer> p1 = new Player<String,Integer>("Ronaldo",7);
        System.out.println(p1);
        Player<String,Integer> p2 = new Player<String,Integer>("messi",10);
        System.out.println(p2);
    }
}

