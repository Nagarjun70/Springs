package com.jsp.AWA;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class office 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
         Person person=(Person)context.getBean("emp");
         System.out.println(person.getId());
         System.out.println(person.getName());
         System.out.println(person.getManager());
         System.out.println(person.getAddress().getCountry());
         System.out.println(person.getAddress().getState());
	}
}