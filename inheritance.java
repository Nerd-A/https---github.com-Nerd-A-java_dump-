class Parent{
    void Text(){
        System.out.println("I am the parent");
    }
}
class Child extends Parent{
    void msg(){
         System.out.println("I am the child");
    }
    
}
public class inheritance{
    public static void main(String[] args){
         Child c = new Child();
         c.msg();
         c.Text();
    }
}