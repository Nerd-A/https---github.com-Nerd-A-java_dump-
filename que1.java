import java.util.*;
class car{
    String name,price;
   
    public car(String name, String price) {
        this.name=name;
        this.price=price;
    }
    
    public String toString(){
        return name+" for "+price;
    }

}
class que1{
       public static void main(String[] ags){
        try{  ArrayList<car>a = new ArrayList<car>();
           a.add(new car("Mahindra XUV700","12.49 Lakhs"));
           a.add(new car("Kia Seltos","9.95 Lakhs"));
           a.add(new car("Renault","5.64 Lakhs"));
           a.add(new car("Tata Altroz","6.99 Lakhs"));
           a.add(new car("Hyundai Venue","11.58 Lakhs"));

           for(int i =0;i<a.size();i++){
               System.out.println(a.get(i));
           }
           System.out.println();
           System.out.println("Enter new car and price");
           Scanner sc = new Scanner(System.in);
           String b=sc.nextLine();
           String c=sc.nextLine();
           a.add(new car(b,c));
           for(int i =0;i<a.size();i++){
            System.out.println(a.get(i));}
            sc.close();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

           
           
       }
       
}