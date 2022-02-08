package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		 try
		 {
			Configuration configuration= new Configuration(); 
			configuration.configure("mypack/hibernate.cfg.xml");
			SessionFactory sessionFactory=configuration.buildSessionFactory();
			Session session=sessionFactory.openSession();
			System.out.println(session);
			Emp e=new Emp();
			e.setId(2);
			e.setName("kiran");
			e.setAddress("bidar");
			session.save(e);
			Transaction transaction=session.beginTransaction();
			transaction.commit();
			
		 }
		 catch (Exception e)
		 {
			 e.printStackTrace();
		 }

	}

}
