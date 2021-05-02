package com.baljeet.coding.HibernatePrac;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.baljeet.coding.HibernatePrac.model.User;

public class Test {

	public static void main(String[] args) {
		User user=new User(1,"baljeet",new Date(),"Kirti nagar","Developer");
		User user1=new User(2,"Gurjas",new Date(),"Kirti nagar","Developer");
		User user2=new User(3,"jaspreet",new Date(),"Kirti nagar","Developer");
		SessionFactory s=new Configuration().configure().buildSessionFactory();
		Session session=s.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user1);
		session.save(user2);
		session.getTransaction().commit();
		session.close();
		
		
		session=s.openSession();
		session.beginTransaction();
		User u=(User)session.get(User.class,1);
		System.out.println(u.getName());
	
		session.close();
		
		
	}

}
