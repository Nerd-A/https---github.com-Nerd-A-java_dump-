import java.util.*;
class ArrayListEx{
    public static void main(String[] args)
    {
        ArrayList <Integer> a1 = new ArrayList<Integer>();   // Declared an Array.
        for(int i = 100; i<=105; i++)
         a1.add(i);
        
        
         System.out.println(a1);

         a1.remove(3); // remove element.
         System.out.println(a1);

         for(int i=0 ; i<a1.size() ; i++)
          System.out.println(a1.get(i) + " ");
          System.out.println("1:Add,2:Remove,3.Clear");
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          
          switch(n)
          {
              case 1: {
                  System.out.println("New Integer");
                  int x=sc.nextInt();
                   a1.add(x);
                   for(int i=0;i<a1.size();i++){
                       System.out.println(a1.get(i)+ " ");
                   }
                   break;

                   
              }

              case 2:{
                  System.out.println("element number");
                  int x = sc.nextInt();
                  a1.remove(x);
                  for(int i=0;i<a1.size();i++)
                  {
                    System.out.println(a1.get(i)+ " ");
                  
                  }
                  break;
                  

              }
              case 3: a1.clear();
              System.out.println("Array has been cleared.");
              break;
                    
                
              case 4: default:
              {
                  System.out.println("Choose from the geiven options only.");
                  break;
                  
              }
                
              
                      
          }
          sc.close();
         
        
    }  
}