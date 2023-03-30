package com.jsp.employye;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class mainEmployee 
{
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee Employee=(Employee) context.getBean("myemployee");
		System.out.println("Employee ID is "+Employee.getId());
		System.out.println("Employee Name is "+Employee.getName());
		System.out.println("Employee Age is "+Employee.getAge());
		System.out.println("Employee Salary is "+Employee.getSal());
		System.out.println("Employee Job is "+Employee.getJob());
		System.out.println("----------------------------------------");
		
		Employee Employee1=(Employee) context.getBean("myemp1");
		System.out.println("Employee ID is "+Employee1.getId());
		System.out.println("Employee Name is "+Employee1.getName());
		System.out.println("Employee Age is "+Employee1.getAge());
		System.out.println("Employee Salary is "+Employee1.getSal());
		System.out.println("Employee Job is "+Employee1.getJob());
	}

}
