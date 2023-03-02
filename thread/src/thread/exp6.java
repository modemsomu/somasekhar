package thread;
public class exp6  extends Thread
{
	@Override
public void run()
{
	try
	{
		Thread.sleep(1000);
		System.out.println("i am from run()");
	}
 catch (Exception e) 
	{
	 e.printStackTrace();
	}
	}
	public static void main(String[] args) throws Exception
	{
		Thread t1=new exp6();
		System.out.println("before starting thread state:"+t1.getName());
		System.out.println("before starting thread state:"+t1.isAlive());
		t1.start();
		System.out.println("after starting thread state:"+t1.getName());
		System.out.println("after starting thread state:"+t1.isAlive());
		Thread.sleep(2200);
		System.out.println("in sleep thread state:"+t1.getName());
		System.out.print("in sleep thread status:"+t1.isAlive());
        t1.join();
		System.out.println("after joining thread state:"+t1.getName());
		System.out.println("after joining thread state:"+t1.isAlive());
		}
}
