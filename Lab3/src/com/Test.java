package com;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = meta.getSessionFactoryBuilder().build();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		int ch,sid;
		String name;
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		while (true) {
			System.out.println("1.add \2.delete \3.display");
			System.out.println("enter ur choice");
			ch = sc.nextInt();

			switch (ch) {
			
			case 1:
				System.out.println("add");
				System.out.println("sid");
				sid = sc.nextInt();
				System.out.println("name");
				name=sc.next();
				s1.setsid(sid);
				s1.setname(name);
				session.save(s1);
				tr.commit();
				break;
				
			case 2:
				System.out.println("delete");
				System.out.println("enter sid");
				sid = sc.nextInt();
				s1.setsid(sid);
				session.delete(s1);
				tr.commit();
				break;
				
			case 3:
				List<Student> l = session.createQuery("FROM Student").list();
				for(Student s:l) {
					System.out.println(s.getsid());
					System.out.println(s.getname());
					
				}
				break;
				
			}

			}

		}
	}
