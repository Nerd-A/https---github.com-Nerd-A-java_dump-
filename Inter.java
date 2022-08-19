interface Addit{
    void submition(int x,int y);
}
class Inter implements Addit{
    public void submition(int x, int y){
        int s = x+y;
        System.out.println(s);
    }

   
        public static void main(String[] args){
            Inter s =new Inter();
             s.submition(4,5);
        }
        
    }
