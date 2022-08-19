public class Cloning implements  Cloneable { 

    String name; 

    int age; 

 public static void main(String[] args) { 

    Cloning obj1 = new Cloning(); 

       obj1.name = "This is object clonning"; 

        obj1.age = 29; 

        System.out.println(obj1.name); 

        System.out.println(obj1.age); 

        try { 

          Cloning obj2 = (Cloning) obj1.clone(); 

            System.out.println(obj2.name); 

            System.out.println(obj2.age); 

        } catch (Exception e) {System.out.println(e);   } } 

 } 