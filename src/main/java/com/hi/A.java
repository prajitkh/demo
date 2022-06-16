package com.hi;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class A {

	public static void main(String[] args) {
		System.out.println("project started........");
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
	  Stu stu=new Stu();
	  stu.setId(12);
	  stu.setName("prajit");
	  Session session=factory.openSession();
  Transaction tx=session.beginTransaction();
  session.save(stu);
  tx.commit();
  session.close();
}
}
