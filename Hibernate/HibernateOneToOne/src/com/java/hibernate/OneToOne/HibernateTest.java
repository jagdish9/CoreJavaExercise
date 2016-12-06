package com.java.hibernate.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.hibernate.OneToOne.dto.UserDetails;
import com.java.hibernate.OneToOne.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");
		
		UserDetails user = new UserDetails();
		user.setUserName("First User Name");
		user.setVehicle(vehicle);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		session.getTransaction().commit();
		session.close();
	}

}
