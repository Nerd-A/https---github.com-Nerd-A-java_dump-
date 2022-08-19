// without generic class 
/*public class gmeth{
    public static  void iAdd(int[] a){
        int sum=0;
        for(int i:a){
          sum+=i;

        }
        System.out.println(sum);
    }
    public static  void fAdd(float[] b){
        float sum=0;
        for(float i:b){
          sum+=i;

        }
        System.out.println(sum);
    }
    public static  void dAdd(double[] c){
        float sum=0;
        for(double i:c){
          sum+=i;

        }
        System.out.println(sum);
    }
    public static void main(String[] args){
         int a[] = {1,2,3};
         iAdd(a);
         float b[] = {1.23f,23.4f};
         fAdd(b);
         double c[] = {2.345,5645.1};
         dAdd(c);

        

    }
}*/
//with generic class 
public class gmeth{
    public static<E>void Show(E[] a)  // E is user defined type.
    {
        
         for(E i : a){
            System.out.println(i+" ");
         }
    }   
}