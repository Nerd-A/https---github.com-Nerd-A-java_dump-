abstract class  Addition{
    abstract void add(); // abstract method has no body
   void method(){
       System.out.println("its a concrete method");
   }
}
class sum extends Addition
// class sum must override add(); method 
// otherwise, compile time exception occurs 
{
    void add()
    {
        System.out.println("implementation of add();");
    }
}
public class AbstractEx
{
   public static void main (String[] args){
       sum b = new sum();
       b.add();
       b.method();
   }
}