package com.jsp.assign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAssign 
{
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Person person=(Person)context.getBean("myperson");
		Mobile mobile=(Mobile)context.getBean("mymobile");
		System.out.println("Person ID is: "+person.getId());
		System.out.println("Person Name is: "+person.getName());
		System.out.println("Person PHNO is: "+person.getPhno());
		
		System.out.println("Person MOBID is: "+person.getMobile().getId());
		System.out.println("Person MOBBrand is: "+person.getMobile().getBrand());
		System.out.println("Person MOBBrandColor is: "+person.getMobile().getBrandcolor());
		System.out.println("Person MOBMap is: "+person.getMobile().getMap());
		
		System.out.println("Person AmznID is: "+mobile.getAmazon().getOrderid());
		System.out.println("Person AmznQnty is: "+mobile.getAmazon().getQuantity());
		System.out.println("Person amznCost is: "+mobile.getAmazon().getCost());
		System.out.println("Person AmznItem is: "+mobile.getAmazon().getItem());

	}
}
