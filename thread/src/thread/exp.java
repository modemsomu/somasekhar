package thread;
class MyThread extends Thread
{
	public void run()
	{
	for(int i=0;i<10;i++)
	{
		System.out.println("child thread");
	}
	}
	}
public class exp 
{
public static void main(String[] args) 
{
	MyThread t=new MyThread();
	t.start();
	for (int i=0;i<10;i++)
	{
		System.out.println("main Thread");	
	}
	System.out.println();
	}
}
