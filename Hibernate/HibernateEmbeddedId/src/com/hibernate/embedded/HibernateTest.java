package com.hibernate.embedded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.embedded.dto.Address;
import com.hibernate.embedded.dto.LoginName;
import com.hibernate.embedded.dto.UserDetailsAll;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginName loginName = new LoginName();
		loginName.setEmpId(200);
		loginName.setEmailId("user@mail.com");
		
		UserDetailsAll user = new UserDetailsAll();
		user.setUserId(loginName);
		user.setUserName("First User");
		
		Address addr = new Address();
		addr.setStreet("office street");
		addr.setCity("Office City");
		addr.setState("Office State");
		addr.setPincode("Office PinCode");
	    user.setOfficeAddress(addr);
	    
	    Address addr2 = new Address();
		addr2.setStreet("Home street");
		addr2.setCity("Home City");
		addr2.setState("Home State");
		addr2.setPincode("Home PinCode");
		user.setHomeAddress(addr2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

}
