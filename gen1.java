import java.util.*;
public class gen1{
    public static void main(String[] args){
       Map<Character,Integer> count = new HashMap<Character,Integer>();
       String inp= "OOP in SCOPEI";
       for(char c  : inp.toCharArray()){
           if(count.containsKey(c)){
               count.put(c,count.get(c) + 1);
           }
           else{
               count.put(c,1);
           }
       }
       for(Map.Entry<Character,Integer> entry : count.entrySet()){
           System.out.println(entry.getKey()+" occurs "+ entry.getValue());
       }
    }
}