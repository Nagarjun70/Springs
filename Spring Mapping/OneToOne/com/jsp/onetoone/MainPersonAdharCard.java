package com.jsp.onetoone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPersonAdharCard 
{
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Person person=(Person)context.getBean("myperson");
		System.out.println("Person ID is: "+person.getId());
		System.out.println("Person Name is: "+person.getName());
		System.out.println("Person Gender is: "+person.getGender());
		System.out.println("Person Phno is: "+person.getPhno());
		System.out.println("Person AdharID is: "+person.getCard().getId());
		System.out.println("Person AdharAddress is: "+person.getCard().getAddress());
		
	}

}
