public class ConstrOverlod {
    public static void main(String args[]) {
    Practice p1=new Practice();
    Practice p2=new Practice(12,"suresh");
    
    }
    
    
    
    }
    class Practice{
    String name;
    int x;
    public Practice() {
    System.out.println("Constructor 1");
    
    }
    
    public Practice(int x, String name) {
    
    this.name=name;
    this.x=x;
    System.out.println(name);
    System.out.println(x);
    
    }
    
    
    }