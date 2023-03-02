package thread;

public class exp2 extends Thread
{
public void run()
{
	System.out.println("i am from run method");
}
public static void main(String[] args)
	{
	exp2 r1=new exp2();
	exp2 r2=new exp2();
    exp2 r3=new exp2();
    
    System.out.println("default thread name:"+r1.getName());
    System.out.println("default thread name:"+r2.getName());
    System.out.println("default thread name:"+r3.getName());
    r1.setName("open ac");
    r1.setName("withdraw");
    r1.setName("transfer");
    System.out.println("thread name:"+r1.getName());
    System.out.println("thread name:"+r2.getName());
    System.out.println("thread name:"+r3.getName());
    
    System.out.println("default thread name:"+r1.getPriority());
    System.out.println("default thread name:"+r2.getPriority());
    System.out.println("default thread name:"+r3.getPriority());
     
    System.out.println(MAX_PRIORITY);
    System.out.println(NORM_PRIORITY);
    System.out.println(MIN_PRIORITY);
    r1.setPriority(MAX_PRIORITY);
    r3.setPriority(MIN_PRIORITY);
    System.out.println(" thread name:"+r1.getPriority());
    System.out.println(" thread name:"+r2.getPriority());
    System.out.println(" thread name:"+r3.getPriority());
	}

}


