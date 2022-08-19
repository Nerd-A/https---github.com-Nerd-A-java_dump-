class CarsPrice{
    void price(){
        System.out.println("This function displays the price of the cars");
    }
}

class Honda extends CarsPrice{
    void price(){
        System.out.println("Price of this motor vehicle is between 4-5lakhs ");
    }
}

class Suzuki extends CarsPrice{
    void price(){
        System.out.println("Price of this motor vehicle is between 8-9 lakhs");
    }
}
public class Main {
    public static void main(String[] args) {
        Honda h1= new Honda();
        Suzuki S1 = new Suzuki();
        h1.price();
        S1.price();

    }

}
    
