import java.util.*;
public class Iter{
    public static void main(String[] args){
        ArrayList<Integer> A =  new ArrayList<Integer>();
        A.add(1);
        A.add(19);
        A.add(100);
        A.add(75);
        Iterator<Integer> itr = A.iterator();
        while(itr.hasNext()){
           System.out.println(itr.next());
        }

    }
}

