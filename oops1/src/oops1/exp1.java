package oops1;
 class naveen
{
	int id=11;
	String name="java";
	 void  display()
	{
		System.out.println("display()");
	}
	 void show()
	{
		System.out.println("showtime()");
	
	}
	 void dog()
	{
		System.out.println("dog eat cat()");
	}
}
class pavan extends  naveen
	{
void animal()

{
String king="madanapalli";
String b="india";
System.out.println("states()"+id+""+name+""+king+""+b);
}
	}
public class exp1
{
public static void main(String[] args)
{
pavan b=new pavan ();
 b.animal();
 b.display();
 b.show ();
 b.dog();
}
}
