class Shape {
    int length;
    int width;
    Shape(int length,int width)
{
      this.length=length;
      this.width=width; 
}
int area(){
    return length*width;

}
}
class Rectangle extends Shape{
    Rectangle(int x,int y){
      super(x, y);
      
    }


    
}
public class Sup{
    public static void main(String[] args){
        Shape s = new Rectangle(30,50);
        System.out.println(s.area());
        
    }
}
