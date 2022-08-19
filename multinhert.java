class Animal {
    void eat() {
    System.out.println(" eating...");
    
    
    
    }
    }
    class dog extends Animal{
    void bark()
    {
        System.out.println(" barking");
    }
    
    
    
    }
    class Babydog extends dog{
    void weep()
    { System.out.println(" weeping");}
    }
    public class multinhert {
    public static void main(String args[])
    {
    Babydog d = new Babydog();
    d.weep();
    d.bark();
    d.eat();
    }
    }