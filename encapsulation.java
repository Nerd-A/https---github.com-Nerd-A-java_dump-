class encapsulation
{
private int Studentid;
private String name;
public int getId()
{
return Studentid;
}
public void setId(int sid)
{
this.Studentid = sid;
}
public String get()
{
return name;
}
public void set(String sname)
{
this.name = sname;
}
}
class Main
{
public static void main(String[] args)
{
encapsulation ob=new encapsulation();
ob.setId (1);
ob.set("aaa");
System.out.println( "\nStudent ID:" + ob.getId()+ " Student Name:" + ob.get());
}
}

