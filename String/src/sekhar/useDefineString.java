package sekhar;

public class useDefineString 
{
	 String Sname;
	  int rollno;
	  useDefineString(String Sname,int rollno)
	  {
		  this.Sname=Sname;
		  this.rollno=rollno;
}
	  //overriding of the toString method
	  public String toString() 
	  {
		  return Sname+"**"+rollno;
	  }
	public static void main(String[] args)
   {
		useDefineString  s=new useDefineString("sekhar",100);
		System.out.println(s);
	}

}
