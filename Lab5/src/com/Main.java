package com;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[ ]args) {
		Scanner sc = new Scanner(System.in);
		int id,Tid;
		String name,desc;
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Customer c = ac.getBean("Customer", Customer.class);
		id = sc.nextInt();
		c.setId(id);
		name=sc.next();
		c.setName(name);
		c.toString();
		
		Ticket t = ac.getBean("Ticket",Ticket.class);
		Tid=sc.nextInt();
		t.setTid(Tid);
		desc=sc.next();
		t.setDesc(desc);
		t.setCustomer(c);
		System.out.println(""+t.toString());
		
	}

}
