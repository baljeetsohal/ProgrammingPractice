package com.baljeet.coding.HibernatePrac.OnetoOneMapping;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Test {

	public static void main(String[] args) {
		
		
		Vehicle v=new Vehicle();
		v.setVehiclename("mercedez");
		User user=new User();
		user.setName("Baljeet");
		user.setVehicle(v);
		SessionFactory s=new Configuration().configure().buildSessionFactory();
		Session session=s.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(v);
		session.getTransaction().commit();
		session.close();
		
		
		
		
		
	}

}
