package thread;
class Iteam
{
	int value;
	boolean valSet=false;
	public synchronized void PutIteam(int i)
	{
		try
		{
			if (valSet)
			{
				wait();
			}
			value=i;
			System.out.println("producer produced iteam->"+value);
			valSet=true;
			notify();
		}
				catch(Exception e)
		{
					e.printStackTrace();
		}
	    }
	public synchronized void getIteam()
	{
		try
		{
			if(! valSet)
			{
				wait();
				}
				System.out.println("consumer consumer iteam->"+value);
				valSet=false;
				notify();
			}
					catch(Exception e)
			{
						e.printStackTrace();
			}
		    }
	    	}
class producer extends Thread
{
	int i;
	Iteam iteam;
	
	public producer(Iteam iteam)
	{
		this.iteam=iteam;
	}
	public void run()
	{
		try
		{
			while(true)
			{
				Thread.sleep(1099);
				iteam.PutIteam(i++);
			}
		    }
		catch (Exception e)
		{
		e.printStackTrace();
	}
	}
}
class consumer extends Thread
{
Iteam iteam;
	public consumer(Iteam iteam)
	{
		this.iteam=iteam;
	}
	public void run()
	{
		try
		{
			while(true)
			{
				Thread.sleep(500);
				iteam.getIteam();
			}
		    }
		catch (Exception e)
		{
		e.printStackTrace();
	}
	}
}
public class exp5
{
	public static void main(String[] args)
	{
	Iteam iteam=new Iteam();
	producer pr=new producer(iteam);
	consumer cr=new consumer(iteam);
	pr.start();
	cr.start();
	}
}