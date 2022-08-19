abstract class demo {
    abstract void display();
}
public class app{
    public static void main(String[] arg){
        demo AC = new demo(){
            void display()
            {
                System.out.println("hello");

            }
        };
        AC.display();
        System.out.println("world");

        
    }
}