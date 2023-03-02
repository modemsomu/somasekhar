package thread;
class bank
{
	public void transfer()
	{
		System.out.println("transfer");
	}
	}
class maths
{
	public void add()
	{
		System.out.println("add");
	}
}
public class exp4 implements Runnable
{
	public void run()
	{
		try
		{
			bank b=new bank();
			b.transfer();
			Thread.sleep(2500);
			maths m=new maths();
			m.add();
 		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
public static void main(String[] args) throws Exception
{
exp4 t1=new exp4();
Thread t2=new Thread(t1);
t2.start();
t2.join();

}
}
