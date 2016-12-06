package com.hibernate.addition;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.addition.dto.Address;
import com.hibernate.addition.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDetails user = new UserDetails();
		user.setUserName("First User");
		
		Address addr = new Address();
		addr.setStreet("First street");
		addr.setState("First state");
		addr.setCity("First city");
		addr.setPincode("First pincode");
		
		Address addr2 = new Address();
		addr2.setStreet("Second street");
		addr2.setState("Second state");
		addr2.setCity("Second city");
		addr2.setPincode("Second pincode");
		
		user.getListAddress().add(addr);
		user.getListAddress().add(addr2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();

	}

}
