package hibn;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class test 
{

	public static void main(String[] args) 
	{
		Configuration mss=new Configuration();
	
		mss.configure("hibernate.cfg.xml");
		SessionFactory sf=mss.buildSessionFactory();
		Session session=sf.openSession();
		Transaction ts=session.beginTransaction();
		customer cobj=new customer();
		cobj.setProductname("sekhar");
		cobj.setLocation("kal");
		session.persist(cobj);
		ts.commit();
		session.close();
		System.out.print("done");
 
	}

}
