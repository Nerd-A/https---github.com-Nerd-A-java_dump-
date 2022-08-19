class Student{
    String name;
    int marks;
    int rollNo;
    Student(String n,int m,int roll){
        this.name=n;
        this.marks=m;
        this.rollNo=roll;
    }

public void display(){
        System.out.println("The name of the student is "+this.name+" with Roll no. "+ this.rollNo+" and obtained the marks of "+ this.marks);
        System.out.println();
}
}
public class ArrObj {

    public static void main(String[] args) {
      Student obj [] =new Student[5];
      obj[1] = new Student("AAA",1,2);
      obj[1].display();
      obj[2] = new Student("BBB",2,3);
       obj[2].display();
      obj[3] = new Student("CCC",3,4);
      obj[3].display();
      obj[4] = new Student("DDD",5,3);
       obj[4].display();
}
}

