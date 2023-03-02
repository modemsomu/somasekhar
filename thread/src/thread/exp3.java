package thread;
public class exp3 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("i am from run():"+Thread.currentThread().currentThread().getName());
	}
public static void main(String[] args)
{
	exp3 t1=new exp3();
    //t1.start();
	ThreadGroup mg1=new ThreadGroup("bank");
	Thread m2=new Thread (mg1,t1,"pen ac");
	Thread m3=new Thread (mg1,t1,"whithdraw");
	Thread m4=new Thread (mg1,t1,"transfer");
	
	ThreadGroup tg2=new ThreadGroup("maths");
	
	Thread m5=new Thread (tg2,t1,"add");
	Thread m6=new Thread (tg2,t1,"sub");
	Thread m7=new Thread (tg2,t1,"div");
	m4.start();
	m6.start();
	
	System.out.println("Thread group 1:"+mg1.activeCount());
	System.out.println("Thread group 2:"+tg2.activeCount());
	System.out.println(mg1);
	}
}
