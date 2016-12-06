package com.hibernate.cascadeType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.cascadeType.dto.UserDetails;
import com.hibernate.cascadeType.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");
		
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("Jeep");
		
		UserDetails user = new UserDetails();
		user.setUserName("First Name");
		user.getVehicle().add(vehicle);
		user.getVehicle().add(vehicle2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		//session.save(user);  // any one we can use either save or persist
		session.persist(user);
	//	session.save(vehicle); // if we are not saving entities then we can use cascade type
	//	session.save(vehicle2);  // if we are not saving entities then we can use cascade type
		// when we will not save then it will only create the objects but not inserting in DB
		session.getTransaction().commit();
		session.close();
	
	}

}
