package com.baljeet.coding.HibernatePrac;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.baljeet.coding.HibernatePrac.model.Address;
import com.baljeet.coding.HibernatePrac.model.User;

public class Test {

	public static void main(String[] args) {
		Address add=new Address();
		add.setState("Delhi");
		User user=new User();
		user.setName("Baljeet");
		user.setAddress(add);
		User user1=new User();
		user1.setName("Jaspreet");;
		SessionFactory s=new Configuration().configure().buildSessionFactory();
		Session session=s.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user1);
		session.getTransaction().commit();
		session.close();
		
		
		session=s.openSession();
		session.beginTransaction();
		User u=(User)session.get(User.class,1);
		System.out.println(u.getName());
	
		session.close();
		
		
	}

}
