package com.baljeet.coding.HibernatePrac.OnetoManyMapping;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Test {

	public static void main(String[] args) {
		
		
		Vehicle v1=new Vehicle();
		v1.setVehiclename("mercedez");
		Vehicle v2=new Vehicle();
		v2.setVehiclename("BMW");
		User user=new User();
		user.setName("Baljeet");
		user.getVehiclelist().add(v1);
		user.getVehiclelist().add(v2);
		SessionFactory s=new Configuration().configure().buildSessionFactory();
		Session session=s.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(v1);
		session.save(v2);
		session.getTransaction().commit();
		session.close();
		
		
		
		
		
	}

}
