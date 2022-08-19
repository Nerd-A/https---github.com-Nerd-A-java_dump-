class Animal{  
    void eat(){System.out.println("eating...");}
  }  
  class Lion  extends Animal {  
      void roar(){System.out.println("Roaring..");
    }  }
    class Lioncub extends Lion
    {  void weep(){
        System.out.println("weeping...");
    } 
     }   class InheritEx{ 
          public static void main(String args[])
          {  
              Lioncub d=new Lioncub();  
              d.roar(); 
               d.eat(); 
               d.weep(); 
             }
            } 