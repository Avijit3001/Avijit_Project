package com.learn.mavenProject.HibernateProject1;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
public class AppTest
{
	public static void main(String []args)
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory	factory = cfg.buildSessionFactory();
		System.out.println(factory);
		System.out.println("Hibernate is working");
	}
}