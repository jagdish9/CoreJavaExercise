package com.java.hibernate.lazyANDeager;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.hibernate.lazyANDeager.dto.Address;
import com.java.hibernate.lazyANDeager.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetails user = new UserDetails();
		user.setUserName("First User");
		
		Address addr = new Address();
		addr.setStreet("first street");
		addr.setCity("first City");
		addr.setState("first State");
		addr.setPincode("first PinCode");
		addr.setDate(new Date());
		user.getListOfAddress().add(addr);
		
	    Address addr2 = new Address();
		addr2.setStreet("Second street");
		addr2.setCity("Second City");
		addr2.setState("Second State");
		addr2.setPincode("Second PinCode");
		addr2.setDate(new Date());
		user.getListOfAddress().add(addr2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		user = null;
		session = sessionFactory.openSession();
		user = (UserDetails)session.get(UserDetails.class, 1);
		session.close(); //session close, cant access if fecth type is lazy
		System.out.println(user.getListOfAddress().size());
	}
  /* by default fetch type is lazy, if we close the session after that we try to access, we will get
   the error, but if we define fecth type is eager explicitly then after closing the session
   we will get the data becuase it retrives from proxy method*/
}
