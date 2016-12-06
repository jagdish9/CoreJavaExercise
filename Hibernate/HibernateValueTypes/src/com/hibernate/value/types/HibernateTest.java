package com.hibernate.value.types;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.value.dto.Address;
import com.hibernate.value.dto.UserDetailsView;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDetailsView user = new UserDetailsView();
		user.setUserId(1);
		user.setUserName("First user");
		user.setJoinedDate(new Date());
		user.setDescription("Description");
		
		Address addr = new Address();
		addr.setStreet("Street Name");
		addr.setState("State Name");
		addr.setCity("City Name");
		addr.setPincode("9383727");
		user.setAddress(addr);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession(); // session object is per application
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

}
