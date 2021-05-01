package com.baljeet.coding.HibernatePrac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.baljeet.coding.HibernatePrac.model.User;

public class Test {

	public static void main(String[] args) {
		User user=new User(1,"baljeet");
		User user1=new User(2,"Gurjas");
		User user2=new User(3,"jaspreet");
		SessionFactory s=new Configuration().configure().buildSessionFactory();
		Session session=s.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user1);
		session.save(user2);
		session.getTransaction().commit();
		session.close();
		
	}

}
