package com.java.hibernate.retrieve;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.hibernate.dto.UserDetailsList;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDetailsList user = new UserDetailsList();
		user.setUserId(1);
		user.setUserName("First user");
		user.setJoinedDate(new Date());
		user.setAddress("First user's address");
		user.setDescription("Description");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession(); // session object is per application
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		user = null;
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = (UserDetailsList)session.get(UserDetailsList.class, 1);
		System.out.println("User Name retrieved is "+user.getUserName());
		
	}

}
