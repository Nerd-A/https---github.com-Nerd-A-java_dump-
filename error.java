

import java.util.*;
public class error{
    public static void main(String[] ars){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        try
        {
            int arr[] = {1,2,3,4};
            System.out.println(arr[n]);
        }
        catch(Exception e){
            System.out.println("Something Went Wrong!!");
        }

        sc.close();
    }
}

