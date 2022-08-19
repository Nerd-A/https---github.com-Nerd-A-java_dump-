import java.util.*;
class Student{
    int rank;
    String name;
    
    public Student(int rank , String name){
        this.rank=rank;
        this.name=name;
    }
    public String toString(){
        return rank +" "+ name;
    }


}
class Sortbyrank implements Comparator<Student>{
    
    public int compare(Student a,Student b){
        return a.rank-b.rank;
    }
}
class Sortbyname implements Comparator<Student>{
    public int compare(Student a, Student b){
        return a.name.compareTo(b.name);
    }
    
}

class que4{
    public static void main(String[] args){
        ArrayList<Student>a=new ArrayList<Student>();
        a.add(new Student(1,"Shreya"));
        a.add(new Student(2,"Mayank"));
        a.add(new Student(3,"Aditya"));

        Collections.sort(a,new Sortbyrank());
        System.out.println("By Ranks");
        for(int i=0 ; i<3; i++){
               System.out.println(a.get(i));
        }
        Collections.sort(a,new Sortbyname());
        System.out.println("By Name");
        for(int i=0;i<3;i++){
            System.out.println(a.get(i));
        }

        

        

    }
}

