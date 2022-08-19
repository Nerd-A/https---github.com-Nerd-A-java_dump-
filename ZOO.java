import java.util.*;
class ZOO
{


static int zoo(char[]b,char a)
{
    int count=0;
    
    for(int i=0;i<b.length;i++)
    {
        if(b[i]==a)
        {
            count++;
        }
    }
    return count++; 
}


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char []c = s.toCharArray();
        int x=zoo(c,'z');
        int y=zoo(c,'o');
        if(2*x==y)
        System.out.println("yes");
        else
        System.out.println("No");
        sc.close();
        
        
        


    }
}