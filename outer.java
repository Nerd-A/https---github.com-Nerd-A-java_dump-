class outer{
    
    private int x=10;
    public void Add()
    {
        int y=x+100;
        System.out.println(y);
    }
    class inner{
        
        
        
        public  void show(){
            System.out.println("from inner class this is:" + x );
        }
        
    }
    public static void main(String[] args)
    {
        outer obj = new outer();
        outer.inner in = obj.new inner();
        in.show();
        obj.Add();
        
    }



    
}