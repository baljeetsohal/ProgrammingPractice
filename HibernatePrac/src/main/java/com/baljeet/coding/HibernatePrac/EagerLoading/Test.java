package com.baljeet.coding.HibernatePrac.EagerLoading;

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
		Address add1=new Address();
		add.setState("Lucknow");
		User user=new User();
		user.setName("Baljeet");
		user.getListofAddress().add(add);
		user.getListofAddress().add(add1);
		SessionFactory s=new Configuration().configure().buildSessionFactory();
		Session session=s.openSession();
		session.beginTransaction();
		session.save(user);
		
		session.getTransaction().commit();
		session.close();
		
		
		session=s.openSession();
		session.beginTransaction();
		User u=(User)session.get(User.class,1);
	    System.out.println(u.getListofAddress().size());
		
		
	}

}
