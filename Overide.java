class Animal{
    void text(){
        System.out.println("Animal");
    }
    void text2(){
        System.out.println("VIT-AP");
    }
}
class HostelBoys extends Animal{
    void text(){
        System.out.println("Hostel boys");
    }


}
public class Overide{
    public static void main(String[] args){
        HostelBoys H = new HostelBoys();
        H.text();
    }
}
