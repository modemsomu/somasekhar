package oops1;

public class multi
{
	int no;
	public void getmulti(int a)
	{
		no=a;
		
	}
	public void putdata()
	{
		System.out.println("no="+no);
	}
}
	class test extends multi
	{
		int m1,m2;
		public void accept(int x,int y)
		{
			m1=x;
			m2=y;
		}
		public void display()
		{
			System.out.println(m1+"-----"+m2);
		}
	}
	class result extends test
	{
		int total;
		public void putresult()
		{
			total=m1+m2;
			System.out.println(total);
		}
	}
	class sekhar
	{
public static void main(String[] args)
{
result a=new result();
a.getmulti(100);
a.putdata();
a.accept(5,8);
a.display();
a.putresult();
}
	}