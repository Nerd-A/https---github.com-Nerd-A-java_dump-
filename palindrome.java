public class palindrome {
    static void palin(String x){
        int len=x.length();
        int count=0;
        
        for (int i=0;i<len/2;i++){
            if(x.charAt(i)!=x.charAt(len-i-1)){
                count++;
            }
        }
        if(count==0){
            System.out.println(" A Palindrome");
        }
        else
        System.out.println("Not a Palindrome");


    }
    public static void main(String[] args){
        String a="aditya";
        String b="racecar";
        palin(a);
        palin(b);
    }
}
