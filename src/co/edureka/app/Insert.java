package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.domains.Student;
public class Insert {

	public static void main(String... arvs) {
		try {
			Configuration config=new Configuration();
			config.configure("co/edureka/configs/hibernate.cfg.xml");
			SessionFactory sfactory=config.buildSessionFactory();
			
			Session session=sfactory.openSession();
			Transaction tx=session.beginTransaction();
			Student st=new Student(null,"Soham","sohame@gmail.com","84848939");
			
			session.save(st);
			
			System.out.println("--------------");
			
			tx.commit();
			session.close();
			sfactory.close();
			
		}
		catch(Exception ex) {
			System.out.println("Excepton occured "+ex);
		}
		
	}
}
