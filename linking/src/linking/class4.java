package linking;

public class class4 
{

	public void checkSal(double sal)throws class1,class2
	{
	if(sal>50055)
	{
class1 pe=new class1("valid salary");
throw(pe);
}
	else
	{
		class1 ne=new class1("invalid salary");
		throw(ne);
	}
	}
}
