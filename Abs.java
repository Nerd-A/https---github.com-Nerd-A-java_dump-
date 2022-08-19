abstract class Student{
String name;
int rollno;
Student()
{
name="aaa";
rollno=1;
}
abstract void subject();
void display()
{
System.out.println(name);
System.out.println(rollno);
}
}
class School extends Student
{
public void subject()
{
System.out.println("Object oriented programming");
}
public static void main(String args[])
{
Student obj=new School();
obj.display();
obj.subject();
System.out.println("Name and roll no="+obj.name+" "+obj.rollno);
}
}

