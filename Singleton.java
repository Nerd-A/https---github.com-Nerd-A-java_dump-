class Singleton
{
private static Singleton mob;
private Singleton()
{
}
public static Singleton getInstance()
{
if(mob == null)
{
mob = new Singleton();
}
return mob;
}
public void marks()
{
System.out.println("Got the marks, done!");
}
}
class Main
{
public static void main(String[] args)
{
Singleton db1;
db1= Singleton.getInstance();
db1.marks();
}
}

