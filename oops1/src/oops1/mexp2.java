package oops1;

public class mexp2
{
	int no=120;
	String name ="sekhar";
	 void mexp2()
	 {
		 System.out.println("it's me sekhar somusekhar");
	 }
	 class somu extends mexp2
	 {
		 void bhavya()
		 {
			 System.out.println("no="+no);
			 System.out.println("name="+name);
		 }
	 }
	 public class demo extends sekhar
	 {
		int no=500;
		String old="prashnth";
	
		void display()
		{
			System.out.println("no="+no);
			System.out.println("name="+name);
		}
	 }
public static void main(String[] args)
{
	mexp2 ap = new mexp2();
	ap.mexp2();
	ap.mexp2();
sekhar j=new sekhar();
	
	
}

}
