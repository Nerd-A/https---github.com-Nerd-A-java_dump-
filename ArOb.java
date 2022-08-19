class car {
   private  String company;
   private  String name;
   private  int milage;
    car(String company, String name, int milage){
        this.company = company;
        this.name = name;
        this.milage=milage;
    }
    void display(){
        System.out.println(">>Brand Name is "+ this.company+" the Name of the car is "+this.name+" It gives an average of "+this.milage+"Km/L");
    }

}
public class ArOb{
    public static void main(String[] args){
        car a[] = new car[1];   
        a[0] = new car("aa","bb",3);
        a[0].display();                             //int a [] = new int[4];
    }
}